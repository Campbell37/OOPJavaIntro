/**
 * @author Sol Campbell 17010688
 * @version 1
 *Suit.java pontoonV4
 */
package altpontoon;

/**
 * @author 17010688
 *
 */
public enum Suit 
{
	HEARTS("Hearts"),
	DIAMONDS("Diamonds"),
	SPADES("Spades"),
	CLUBS("Clubs");	
	
	private final String suitName;
	
	private Suit(String suitName)
	{
		this.suitName = suitName;
	}
	
	public String getSuit()
	{
		return suitName;
	}
}