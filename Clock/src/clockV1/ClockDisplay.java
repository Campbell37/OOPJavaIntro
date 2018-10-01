package clockV1;

public class ClockDisplay 
{
	private Number hour;
	private Number minute;
	private Number second;
	private String display;
	
	
	public ClockDisplay()
	{
		hour = new Number(24);
		minute = new Number(60);
		second = new Number(60);
		updateDisplay();
	}
	
	public ClockDisplay(int hours, int minutes, int seconds)
	{
		hour = new Number(24);
		minute = new Number(60);
		second = new Number(60);
		setTime(hours, minutes,seconds);
	}
		
	public void setTime(int hours, int minutes, int seconds)
	{
		hour.setValue(hours);
		minute.setValue(minutes);
		second.setValue(seconds);
		updateDisplay();
	}
	
	public String getTime()
	{
		return display;
	}
	
    public void updateDisplay() 
    {
        display = hour.getDisplay() + ":" + minute.getDisplay() + ":" + second.getDisplay();
        System.out.println(display);
    }
    
    public void timeCount()
    {
    	second.increase();
	    
	    if(second.getValue() == 0)
	    {
    		minute.increase();
    		
	    	if(minute.getValue() == 0)
	    	{
	    		hour.increase();
	    	}
    	}
    	updateDisplay();
    }
}
