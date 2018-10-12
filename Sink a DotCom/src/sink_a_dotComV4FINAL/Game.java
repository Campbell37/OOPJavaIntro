/* Sol Campbell 11/10/1018
 * Sink a DotCom(Full) V2 FINAL
 *  */

package sink_a_dotComV4FINAL;

import java.util.*;

public class Game 
{
	private int numGuesses = 0;
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	
	private void setUp()
	{
		DotCom dc1 = new DotCom();										// Lines 17 to 22 create objects, 3 DotComs
		dc1.setName("OOPJava.com");
		DotCom dc2 = new DotCom();
		dc2.setName("KillerHangovers.com");
		DotCom dc3 = new DotCom();
		dc3.setName("StopTypingEverything.com");
		dotComList.add(dc1);											// Lines 23 to 25 put them in the ArrayList
		dotComList.add(dc2);
		dotComList.add(dc3);
		
		System.out.println("You must destroy all three dot coms on a 2D grid from a1 (bottom left) to g7 (top right)");
		System.out.println("The dot coms are 'OOPJava.com', 'KillerHangovers.com' and 'StopTypingEverything.com'.");
		System.out.println("Your number of guesses will be counted, and you WILL be judged on how well you do.");
		
		for (DotCom dotComtoSet : dotComList)							// For each DotCom
		{
			ArrayList<String> newLocation = helper.placeDotCom(3);
			
			dotComtoSet.setLocationCells(newLocation);
		}
	}
	
	private void startGame()											// Takes user input and starts the game
	{
		while(!dotComList.isEmpty())
		{
			String userGuess = helper.getUserInput("Enter a number.");
			checkUserGuess(userGuess);
		}
		
		endGame();
	}
	
	private void checkUserGuess(String userGuess) 						// Checks for a miss hit or kill
	{
		numGuesses++;
		
		String result = "miss";
		
		for(int x = 0; x< dotComList.size(); x++)
		{
			result = dotComList.get(x).checkYourself(userGuess);
			
			if (result.equals("hit"))
			{
				break;
			}
			if (result.equalsIgnoreCase("kill"))
			{
				dotComList.remove(x);
				break;			
			}
		}
		System.out.println(result);
	}
	
	private void endGame() 												// Ends the game, tells the user how they did
	{
		System.out.println("You destroyed them all!");
		System.out.println("It took you " +numGuesses+ " guesses to do it.");
		
		if(numGuesses < 20)
		{
			System.out.println("Did you cheat? You cheating cheater.");
		}
		
		if(numGuesses > 25 && numGuesses < 40)
		{
			System.out.println("Thats a pretty pitiful result");
		}
		
		if(numGuesses >41)
		{
			System.out.println("Wow, thats an embarising number of guesses. You are really very bad at this.");
		}
	}


	public static void main(String[] args) 
	{
		Game game = new Game();
		game.setUp();
		game.startGame();

	}
}
