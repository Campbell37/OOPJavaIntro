package clockV1;

public class Number 
{
	private int value;
	private int limit;
	
	public Number(int limiter)
	{
		value = 0;
		limit = limiter;
	}
	
    public String getDisplay() 
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
	
	public void setValue (int newValue)
	{
		if((newValue < limit) && (newValue >= 0))
		{
			value = newValue;
		}
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void increase()
	{
		value = (value + 1) % limit;
	}
}
