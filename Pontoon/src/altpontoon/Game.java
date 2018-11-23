package altpontoon; 

import java.util.Scanner; 

public class Game 
{ 
	Scanner sc = new Scanner(System.in); 
 
	Hand player = new Hand(); 
 
	Hand dealer = new Hand(); 

	Deck d1 = new Deck(); 
 
	Hand[] hands = {player,dealer}; 

	public Game() 
	{ 
		startGame(); 
	} 
 
	public void startGame() 
	{ 
		d1.genDeck(); 
		d1.shuffle();  
		d1.deal(hands, 2); 
	} 

	public void printHand() 
	{ 
		System.out.print("You have :" + "\n" + player.showHand()); 
		System.out.println("For a total of: " + player.getTotal()); 
	} 

	public void dealPlayer() 
	{ 
		d1.deal(player,1); 
	} 

	public int playerChoice() 
	{ 
		int choice = 0; 
		System.out.println("Would you another card?"); 
		System.out.println("1 > Yes"); 
		System.out.println("2 > No"); 
		choice = sc.nextInt(); 
		return choice; 
	} 

	public void calcWinner() 
	{ 
		int playerScore = player.getTotal() - 21; 
		int dealerScore = dealer.getTotal() - 21; 

		if(playerScore > dealerScore && playerScore <= 0) 
		{ 
 
			System.out.println("Congratulations, You Win!"); 
		} 
		else 
		{ 
			System.out.println("Sorry, Dealer Wins.."); 
		} 
	} 
} 