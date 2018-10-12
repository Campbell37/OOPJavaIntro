/* Sol Campbell 09/10/1018
 * Sink a DotCom(simple) V2
 */

package sink_a_dotComV2;

public class DotCom 
{

	int[] loactionCells;
	int numHits = 0;
	
	public void setLocationCells(int[]locs)
	{
		loactionCells = locs;
	}
	
	public String checkYourself(String stringGuess)
	{
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		
		for(int cell : loactionCells)
		{
			if (guess == cell)
			{
				result ="hit";
				numHits++;
				break;
			}
		}
		
		if (numHits == loactionCells.length)
		{
			result = "destroyed";
		}
		
		System.out.println(result);
		
		return (result);
	}
}
