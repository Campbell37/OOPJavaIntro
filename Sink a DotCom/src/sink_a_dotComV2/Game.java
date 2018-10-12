/* Sol Campbell 09/10/1018
 * Sink a DotCom(simple) V2
 */

package sink_a_dotComV2;

public class Game 
{

	public static void main(String[] args) 
	{
		int numofGuesses = 0;
		GameHelper helper = new GameHelper();
		
		DotCom theDotCom = new DotCom();
		
		int randomNum = (int)(Math.random()*5);
		
		int[] locations = {randomNum, randomNum+1, randomNum+2};
		theDotCom.setLocationCells(locations);
		
		boolean isAlive = true;
		
		while (isAlive == true)
		{
			String guess = helper.getUserInput("Enter a number.");
			String result = theDotCom.checkYourself(guess);
			numofGuesses++;
		if (result.equals("destroyed"))
		{
			isAlive = false;
			System.out.println("You took " +numofGuesses+ " guesses to destroy the dotcom.");
		}
		}
	}
}
