package exercise1;

import java.util.*;



/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Gagandeep Singh
 * @author Gagandeep Singh Jan 31, 2022 
 */
public class CardTrick
{
    public static void main(String[] args)
    {
        //Create an array of Card objects
        Card[] hand = new Card[7];
       
        //Fill the array with random cards
        for (int i = 0; i < hand.length; i++)
        {
            hand[i] = new Card();
        }
        
        //Ask the user to pick a card
        System.out.println("Please pick a card and remember it");
        
        //Display the cards
        for (Card hand1 : hand) {
            System.out.println(hand1.getDescription());
        }
        
        //Ask the user to enter the card he/she picked
        Scanner in = new Scanner(System.in);
        System.out.println("Which card did you pick (enter suit and value)?");
        String userCard = in.nextLine();
       
        //Search the array for the match to the user's card
        boolean found = false;
        for (int i = 0; i < hand.length; i++)
        {
            if (userCard.equals(hand[i].getDescription()))
            {
                System.out.println("Your card is at position " + i);
                found = true;
            }
        }
       
        if (!found)
        {
            System.out.println("Your card is not in the hand.");
        }
    }

        
    

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo()
    {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Gagandeep Singh, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
    }
}
