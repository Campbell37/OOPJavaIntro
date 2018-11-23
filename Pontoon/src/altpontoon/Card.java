/**
 * @author Sol Campbell 17010688
 * @version 1
 *Card.java pontoonV4
 */
package altpontoon;

/**
 * @author 17010688
 *
 */
public class Card 
{
	private Rank rank;
	private Suit suit;
	
	public Card()
	{
		
	}
	
	public Card(Rank rank, Suit suit)
	{
		this.rank = rank;
		this.suit = suit;
	}
	
	public String getSuit()
	{
		return suit.getSuit();
	}
	
	public int getRank()
	{
		return rank.getRank();
	}
	
	public String printRankString()
	{
		return rank.printRank();
	}
	
	public String toString()		// creates the string displaying the cards
	{
		String string = "";
		
		string += rank.printRank() + " of " + suit.getSuit();
		return string;
	}
}