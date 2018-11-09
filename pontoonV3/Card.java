/*
 Sol Campbell 06/11/2018
 
 For Deck class Card class and the two enums, I used code from http://www.rosettacode.org/wiki/Playing_cards
 */
package pontoonV3;

public class Card 
{
    private final Suit suit;
    private final Value value;
 
    public Card(Suit s, Value v) {
        suit = s;
        value = v;
    }
 
    public String toString() {
        return value + " of " + suit;
    }
}
