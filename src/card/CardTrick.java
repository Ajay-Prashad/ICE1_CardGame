/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        Random r = new Random();
        //Random number between 0-3
        int randomSuit = r.nextInt(3);
        //Random number between 1-13
        int randomValue = r.nextInt(3)+1;

        Scanner scan = new Scanner(System.in);

        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(randomValue);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[randomSuit]);
        }
        //Printing off all of the randomly 
        //insert code to ask the user for Card value and suit, create their card
        System.out.print("Enter a card value (1-13): ");
        int cardValue = scan.nextInt ();
        System.out.print("\nEnter a suit (0-3 where 0=Hearts,1=Diamonds,2-Clubs,3=Spades): ");
        String cardSuit = scan.nextLine();

        Card userCard = new Card();
        userCard.setValue(cardValue);
        userCard.setSuit(cardSuit);

        // and search magicHand here
        for(int i = 0;i<magicHand.length;i++){
            if (magicHand[i].getSuit().equals(cardSuit) && magicHand[i].getValue() == cardValue ){
                System.out.println("Your card is in the pile!");
            }
            else{
                System.out.println("\nSorry, your card is not in the magic hand.");
                }
        }
        //Then report the result here
        // add one luckcard hard code 2,clubs
        magicHand[0].setSuit(Card.SUITS[3]);
        magicHand[0].setValue(2);

    }
    
}
