/*
 Sol Campbell 06/11/2018
 
 For Deck class Card class and the two enums, I used code from http://www.rosettacode.org/wiki/Playing_cards
 */

package pontoonV3;

import java.util.Collections;
import java.util.LinkedList;
 
public class Deck 
{
    private final LinkedList<Card> deck = new LinkedList<Card>();
 
    public Deck() 
    {
        for (Suit s : Suit.values())
            for (Value v : Value.values())
                deck.add(new Card(s, v));
    }
 
    public Card deal() 
    {
        return deck.poll();
    }
 
    public void shuffle() 
    {
        Collections.shuffle(deck);
    }
 
    public String toString()
    {
        return deck.toString();
    }
}
