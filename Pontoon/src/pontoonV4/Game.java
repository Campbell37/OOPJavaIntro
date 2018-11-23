/**
 * @author Sol Campbell 17010688
 * @version 1
 *Game.java pontoonV4
 */
package pontoonV4;

import java.util.Scanner;
/**
 * @author 17010688
 *
 */
public class Game {
	
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		String choice = "";
		int total = 0;
		int dealTotal = 0;
		
		Deck d1 = new Deck();
		
		d1.genDeck();
		d1.shuffle();
		
//		System.out.println(d1.showHand());
		
		Hand h1 = new Hand();
		Hand dealer = new Hand();
		
		Hand hands = h1; 
		
		d1.deal(hands, 2);
		d1.deal(dealer, 2);
		
		System.out.println("You have: \n" +hands.showHand());
		System.out.println("Total value = " + hands.getTotal() + "\n");
		System.out.println("Would you like another card? (Y/N)");
		choice = kboard.nextLine();
		
		if (choice.equalsIgnoreCase("y"))
		{
			do 
			{
				d1.deal(hands, 1);
				System.out.println(hands.showHand());
				System.out.println("Total value = " + hands.getTotal() + "\n");
				
				total = hands.getTotal();
				if (total>21)
				{
					System.out.println("You are bust! \n");
					break;
				}
				
				System.out.println("Would you like another card? (Y/N)");
				choice = kboard.nextLine();				
			}
			while (choice.equalsIgnoreCase("y"));
		}
		
		dealTotal = dealer.getTotal();
		
		System.out.println(total + dealTotal);
				
		if (dealTotal<total)
		{
			while(dealTotal >= 17)
			{
				d1.deal(dealer, 1);
				System.out.println(dealer.showHand());
			}
		}
				
		System.out.println("Dealer has : \n" + dealer.showHand());
		
		System.out.println("Dealers total is : " +dealer.getTotal() +"\nYour total is : "+ hands.getTotal());
		
		if (dealer.getTotal() >= hands.getTotal())
		{
			System.out.println("Dealer wins!");
		}
		
		if (dealer.getTotal() < hands.getTotal() && hands.getTotal() < 22)
		{
			System.out.println("You win!");
		}
		
		else
		{
			System.out.println("Dealer wins!");
		}
		
		
		
		kboard.close();
		
	}
}
