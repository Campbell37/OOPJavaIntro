/* Sol Campbell 11/10/1018
 * Sink a DotCom(Full) V2 FINAL
 */

package sink_a_dotComV4FINAL;

import java.util.ArrayList;

public class DotCom 
{
	
	private ArrayList<String> locationCells;					// ArrayList of locations
	private String name;										// name of each DotCom
	
	public void setLocationCells(ArrayList<String> loc)			// Sets the location of the DotCom using the location from GameHelper
	{
		locationCells = loc;
	}
	
	public void setName(String n)								// Sets the name
	{
		name = n;
	}
	
	public String checkYourself(String userInput)				// Checks for misses, hits and kills. Also ensures a cell cannot be hit multiple times.
	{
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		
		if (index >= 0)
		{
			locationCells.remove(index);						// Removes an entry if it is hit, stopping further hits.
			
			if (locationCells.isEmpty())
			{
				result = "kill";
				
				System.out.println("You have destroyed " +name+ ".");
			}
			else 
			{
				result = "hit";
			}
		}
	
		return (result);										// Returns what has happened. (miss, hit, kill)
	}
}
