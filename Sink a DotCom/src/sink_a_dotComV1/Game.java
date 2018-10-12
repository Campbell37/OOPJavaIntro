/* Sol Campbell 09/10/1018
 * Sink a DotCom(simple) V1
 */

package sink_a_dotComV1;

public class Game 
{

	
	public static void main(String[] args) 
	{
		DotCom dot = new DotCom();
		
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		
		String testResult = "failed";
		
		if(result.equals("hit"))
		{
			testResult ="passed";
		}
		
		System.out.println(testResult);
		
	}
}
