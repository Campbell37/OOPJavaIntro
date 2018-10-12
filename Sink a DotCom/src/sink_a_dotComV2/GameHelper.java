/* Sol Campbell 09/10/2018
 * Sink a DotCom(simple) V2
 * 
 * This class taken directly from Head First Java(p112)
 */

package sink_a_dotComV2;

import java.io.*;

public class GameHelper 
{
	public String getUserInput(String prompt)
	{
		String inputLine = null;
		System.out.println(prompt + " ");
		try
		{
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0) return null;
		}catch (IOException e)
		{
			System.out.println("IOException: " + e);
		}
		return inputLine;
	}
}
