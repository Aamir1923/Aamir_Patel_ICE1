/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
//Aamir Patel
//991715970
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            int cardNumberRand = (int) (Math.random() * 13) + 1;
            c.setValue(cardNumberRand);  // Random value between 1 and 13
            
            int cardSuitRand = (int) (Math.random() * 4);
            c.setSuit(Card.SUITS[cardSuitRand]);  // Random suit
            magicHand[i] = c;
            
            System.out.println("Card: " + cardNumberRand + " of " + Card.SUITS[cardSuitRand] + "(" + cardSuitRand + ")");
        }
        
         int luckyValue = 2;
         int luckySuit = 3;
        Card luckyCard = new Card();
        luckyCard.setValue(luckyValue);
        luckyCard.setSuit(Card.SUITS[luckySuit]);
        
        // Search for the lucky card in magicHand
        boolean Report = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
                Report = true;
                break;
            }
            
        }
        
        // Report the result
        if (Report) {
            System.out.println("Congratulations! Your lucky card is in the magic hand.");
        } else {
            System.out.println("Sorry, your lucky card is not in the magic hand.");
        }
    }
}
