/**
 * @author Sol Campbell 17010688
 * @version 1
 *Hand.java pontoonV4
 */
package altpontoon;

import java.util.ArrayList;

/**
 * @author 17010688
 *
 */
public class Hand 
{
	protected ArrayList<Card> cards;

	public Hand()
	{
		cards = new ArrayList<Card>();
	}
	
	public void clearCard()
	{
		cards.clear();
	}
	
	public void addCard(Card card)
	{
		cards.add(card);
	}
	
	public String showHand()
	{
		String string = "";
		
		for(Card c: cards)
		{
			string += c.toString() + "\n";
		}

		
		return string;
	}
	
	public boolean giveCards(Card card, Hand otherHand)
	{
		if (!cards.contains(card))
		{
			return false;
		}
		
		else
		{
			cards.remove(card);
			otherHand.addCard(card);
			return true;
		}
	}	
	
	public int getTotal()
	{
		int totalValue = 0;
		boolean hasAce = false;
		
		for(int i = 0; i < cards.size(); i++)
		{
			totalValue += cards.get(i).getRank();
			if(cards.get(i).printRankString() == "Ace")
			{
				hasAce = true;
			}
			
			if(hasAce && totalValue <= 11)		//Ace can be 11 0r 1
			{
				totalValue += 10;		
			}
		}
		return totalValue;
	}
}
