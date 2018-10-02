/*
 * Sol Campbell 17010688 02/10/2018
 * Class Number
 */
package clockV1;

public class Number 
{
	private int value;
	private int limit;
	
	public Number(int limiter)				// Constructor
	{
		value = 0;
		limit = limiter;
	}
	
    public String getDisplay() 				// formats the display to traditional 24 hr display, i.e 00:00:00
    {
        if (value < 10)
        {
            return "0" + value;
            
        } 
        
        else
        {       	
            return "" + value;
        }
    }
	
	public void setValue (int newValue)		// sets the value to the input from Display Time
	{
		if((newValue < limit) && (newValue >= 0))
		{
			value = newValue;
		}
	}
	
	public int getValue()					// returns the value so can be used in other classes
	{
		return value;
	}
	
	public void increase()					// increases the value by one if called, used by ticker and to increase number of hrs (e.g 04:59:59 to 05:00:00 
	{
		value = (value + 1) % limit;
	}
}
