/**
 * @author Sol Campbell 17010688
 * @version 1
 *Deck.java pontoonV4
 */
package altpontoon;

import java.util.Random;

/**
 * @author 17010688
 *
 */
public class Deck extends Hand
{
	Random random = new Random();
	
	public void genDeck()
	{
		for(Suit suit: Suit.values())
		{
			for (Rank rank: Rank.values())
			{
				Card card = new Card(rank, suit);
				this.addCard(card);
			}
		}
	}
	
	public void shuffle()			// shuffles the last card, then second last etc.
	{
		for(int i = cards.size() - 1; i > 0; i--)
		{
			int pos = random.nextInt(i);

			cards.set(i, cards.get(pos));
			cards.set(pos, cards.get(i));
		}
	}
	
	public void deal(Hand[] hands, int perHand)
	{
		for(int i = 0; i < perHand; i++)
		{
			for(int j = 0; j < hands.length; j++)
			{
				this.giveCards(cards.get(0), hands[j]); 
			}
		}
	}

	public void deal(Hand hand, int perHand)		// Deals to a single hand
	{
		for(int i = 0; i < perHand; i++)
		{
			this.giveCards(cards.get(0), hand); 
		}
	}
	
}
