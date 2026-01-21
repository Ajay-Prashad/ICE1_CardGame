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
        //Random number between 1-13

        Scanner scan = new Scanner(System.in);

        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            int randomValue = r.nextInt(13)+1;
            c.setValue(randomValue);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int randomSuit = r.nextInt(4);
            c.setSuit(Card.SUITS[randomSuit]);
            magicHand[i] = c;
        
        //Printing off all of the randomly
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());

        }
        //insert code to ask the user for Card value and suit, create their card
        
        Card userCard = new Card();
        System.out.print("Enter a card value (1-13): ");
        int cardValue = scan.nextInt ();
        scan.nextLine();
        System.out.print("\nEnter a suit (0-3 where 0=Hearts,1=Diamonds,2-Clubs,3=Spades): ");
        int cardSuit = scan.nextInt();
        
        userCard.setSuit(Card.SUITS[cardSuit]);
        userCard.setValue(cardValue);

        // and search magicHand here
        for (Card card : magicHand) {
            if (card.getSuit().equals(userCard.getSuit()) && card.getValue() == userCard.getValue()) {
                System.out.println("\nYour card is in the pile!");
            } else {
                System.out.println("Sorry, your card is not in the magic hand.");
            }
        }
        //Then report the result here
        // add one luckcard hard code 2,clubs
        magicHand[0].setSuit(Card.SUITS[3]);
        magicHand[0].setValue(2);

    }
    
}
