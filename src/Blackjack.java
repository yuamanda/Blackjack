import java.util.Scanner;

public class Blackjack
{
    public static void main(String[] args)
    {
        // 1. declare scanner once and outside of the loop
        Scanner scan = new Scanner(System.in);
        // 2. declare P1Random once and outside of any loop
        P1Random rand = new P1Random();

        // deal a card to the player [1,13]
        //rand.nextInt(13) -> [0,12] + 1 -> [1,13]
        int playerCardValue = rand.nextInt(13) + 1;
        // playerCardValue = 13
        // Face cards (King, Queen, Jack) are worth a value of 10. Aces have a value of 1.
        /*
        * If the player choose to hold their hand (Option 2), then the dealer will be dealt his hand.
        * To determine the dealer's hand, generate a random number between 16 and 26 (both inclusive).
         */

        // declare and initialize variables
        int gameNumber = 1;
        boolean repeat = true;
        boolean drawCard = true;
        int playerHand = 0;
        int dealerHand = 0;
        int menuNumber = 0;
        int playerWin = 0;
        int dealerWin = 0;
        int tie = 0;

        System.out.println("START GAME #" + gameNumber);
        System.out.println("");

        // nested while loops
        while(repeat)
        {
            // while loop: run through if drawCard is true
            while(drawCard)
            {
                // if card value is 1, print ace, add 1 to player hand, and exits the loop
                if(playerCardValue == 1)
                {
                    System.out.println("Your card is a ACE!");
                    playerHand += 1;
                    System.out.println("Your hand is: " + playerHand);
                    drawCard = false;
                }
                // if card value is 2, print 2, add 2 to player hand, and exits the loop
                else if(playerCardValue == 2)
                {
                    System.out.println("Your card is a 2!");
                    playerHand += 2;
                    System.out.println("Your hand is: " + playerHand);
                    drawCard = false;
                }
                // if card value is 3, print 3, add 3 to player hand, and exits the loop
                else if(playerCardValue == 3)
                {
                    System.out.println("Your card is a 3!");
                    playerHand += 3;
                    System.out.println("Your hand is: " + playerHand);
                    drawCard = false;
                }
                // if card value is 4, print 4, add 4 to player hand, and exits the loop
                else if(playerCardValue == 4)
                {
                    System.out.println("Your card is a 4!");
                    playerHand += 4;
                    System.out.println("Your hand is: " + playerHand);
                    drawCard = false;
                }
                // if card value is 5, print 5, add 5 to player hand, and exits the loop
                else if(playerCardValue == 5)
                {
                    System.out.println("Your card is a 5!");
                    playerHand += 5;
                    System.out.println("Your hand is: " + playerHand);
                    drawCard = false;
                }
                // if card value is 6, print 6, add 6 to player hand, and exits the loop
                else if(playerCardValue == 6)
                {
                    System.out.println("Your card is a 6!");
                    playerHand += 6;
                    System.out.println("Your hand is: " + playerHand);
                    drawCard = false;
                }
                // if card value is 7, print 7, add 7 to player hand, and exits the loop
                else if(playerCardValue == 7)
                {
                    System.out.println("Your card is a 7!");
                    playerHand += 7;
                    System.out.println("Your hand is: " + playerHand);
                    drawCard = false;
                }
                // if card value is 8, print 8, add 8 to player hand, and exits the loop
                else if(playerCardValue == 8)
                {
                    System.out.println("Your card is a 8!");
                    playerHand += 8;
                    System.out.println("Your hand is: " + playerHand);
                    drawCard = false;
                }
                // if card value is 9, print 9, add 9 to player hand, and exits the loop
                else if(playerCardValue == 9)
                {
                    System.out.println("Your card is a 9!");
                    playerHand += 9;
                    drawCard = false;
                }
                // if card value is 10, print 10, add 10 to player hand, and exits the loop
                else if(playerCardValue == 10)
                {
                    System.out.println("Your card is a 10!");
                    playerHand += 10;
                    System.out.println("Your hand is: " + playerHand);
                    drawCard = false;
                }
                // if card value is 11, print jack, add 10 to player hand, and exits the loop
                else if(playerCardValue == 11)
                {
                    System.out.println("Your card is a JACK!");
                    playerHand += 10;
                    System.out.println("Your hand is: " + playerHand);
                    drawCard = false;
                }
                // if card value is 12, print queen, add 10 to player hand, and exits the loop
                else if(playerCardValue == 12)
                {
                    System.out.println("Your card is a QUEEN!");
                    playerHand += 10;
                    System.out.println("Your hand is: " + playerHand);
                    drawCard = false;
                }
                // if card value is 13, print king, add 10 to player hand, and exits the loop
                else
                {
                    System.out.println("Your card is a KING!");
                    playerHand += 10;
                    System.out.println("Your hand is: " + playerHand);
                    drawCard = false;
                }
            }

            // reset drawCard to true to run through the previous while loop again
            drawCard = true;
            System.out.println("");

            // if playerHand equals to 21, player wins; reset game
            if(playerHand == 21)
            {
                System.out.println("BLACKJACK! You win!");
                System.out.println("");
                playerCardValue = rand.nextInt(13) + 1;
                playerWin++;
                gameNumber++;
                playerHand = 0;
                dealerHand = 0;
                System.out.println("START GAME #" + gameNumber);
                System.out.println("");
                continue;
            }
            // when playerHand is greater than 21, player loses; reset game
            else if(playerHand > 21)
            {
                System.out.println("You exceeded 21! You lose.");
                playerCardValue = rand.nextInt(13) + 1;
                dealerWin++;
                gameNumber++;
                playerHand = 0;
                dealerHand = 0;
                System.out.println("START GAME #" + gameNumber);
                System.out.println("");
                continue;
            }

            // prints menu for user
            while(menuNumber != 4)
            {
                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit");
                System.out.println("");

                // asks user for input
                System.out.print("Choose an option: ");
                menuNumber = scan.nextInt();
                System.out.println("");

                // if input is 1, draw another card for player
                if(menuNumber == 1)
                {
                    playerCardValue = rand.nextInt(13) + 1;
                    break;
                }
                // if input is 2, draw another card for dealer, prints dealerCardValue and playerHand
                else if(menuNumber == 2)
                {
                    int dealerCardValue = rand.nextInt(11) + 16;
                    dealerHand += dealerCardValue;
                    System.out.println("Dealer's hand: " + dealerCardValue);
                    System.out.println("Your hand is: " + playerHand);
                    System.out.println("");

                    // if dealerHand is greater than 21, player wins, reset game
                    if(dealerHand > 21)
                    {
                        System.out.println("You win!");
                        System.out.println("");
                        playerCardValue = rand.nextInt(13) + 1;
                        System.out.println("");
                        playerWin++;
                        gameNumber++;
                        playerHand = 0;
                        dealerHand = 0;
                        System.out.println("START GAME #" + gameNumber);
                        System.out.println("");
                        break;
                    }
                    // if dealerHand is equal to playerHand, dealer and player tie, reset game
                    else if(dealerHand == playerHand)
                    {
                        System.out.println("It's a tie! No one wins!");
                        System.out.println("");
                        playerCardValue = rand.nextInt(13) + 1;
                        tie++;
                        gameNumber++;
                        playerHand = 0;
                        dealerHand = 0;
                        System.out.println("START GAME #" + gameNumber);
                        System.out.println("");
                        break;
                    }
                    // if dealerHand is greater than playerHand, dealer wins, reset game
                    else if(dealerHand > playerHand)
                    {
                        System.out.println("Dealer wins!");
                        System.out.println("");
                        playerCardValue = rand.nextInt(13) + 1;
                        dealerWin++;
                        gameNumber++;
                        playerHand = 0;
                        dealerHand = 0;
                        System.out.println("START GAME #" + gameNumber);
                        System.out.println("");
                        break;
                    }
                    // if dealerHand is less than playerHand, player wins, reset game
                    else if(dealerHand < playerHand)
                    {
                        System.out.println("You win!");
                        System.out.println("");
                        playerCardValue = rand.nextInt(13) + 1;
                        playerWin++;
                        gameNumber++;
                        playerHand = 0;
                        dealerHand = 0;
                        System.out.println("START GAME #" + gameNumber);
                        System.out.println("");
                        break;
                    }
                }
                // if input is 3, print statistics: # of player wins, # of dealer wins, # of tie games, total # of games played, and percentage of player wins
                else if(menuNumber == 3)
                {
                    double percWins = Math.round(playerWin * 100.0 / (gameNumber - 1));
                    System.out.println("Number of Player wins: " + playerWin);
                    System.out.println("Number of Dealer wins: " + dealerWin);
                    System.out.println("Number of tie games: " + tie);
                    System.out.println("Total # of games played is: " + (gameNumber - 1));
                    System.out.println("Percentage of Player wins: " + percWins + "%");
                    drawCard = false;
                    break;
                }
                else if(menuNumber == 4)
                {
                    repeat = false;
                }
                // if input isn't [1, 4], print invalid and ask user to enter a value between [1, 4]
                else
                {
                    System.out.println("Invalid input!");
                    System.out.println("Please enter an integer value between 1 and 4.");
                    System.out.println("");
                }
            }
        }
    }
}
