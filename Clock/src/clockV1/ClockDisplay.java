/*
 * Sol Campbell 17010688 02/10/2018
 * Class ClockDisplay
 */
package clockV1;

import java.util.concurrent.TimeUnit;

public class ClockDisplay 
{
	private Number hour;
	private Number minute;
	private Number second;
	private String display;
	
	
/*	public ClockDisplay()
	{
		hour = new Number(24);
		minute = new Number(60);
		second = new Number(60);
		updateDisplay();
	}
*/	
	public ClockDisplay(int hours, int minutes, int seconds)		// Constructor
	{
		hour = new Number(24);
		minute = new Number(60);
		second = new Number(60);
		setTime(hours, minutes,seconds);
	}
		
	public void setTime(int hours, int minutes, int seconds)		// sets the values in the class Number
	{
		hour.setValue(hours);
		minute.setValue(minutes);
		second.setValue(seconds);
		updateDisplay();
	}
	
	public String getTime()											// returns display
	{
		return display;
	}
	
    public void updateDisplay() 									// shows the time displayed
    {
        display = hour.getDisplay() + ":" + minute.getDisplay() + ":" + second.getDisplay();
        System.out.println(display);
    }
    
    public void timeCount()  throws InterruptedException			// InterupptedException found online as means to break for a second, allowing a ticking clock.
    {
	    int x;
	    for(x=0; x<3600; x++)
	    {   second.increase();										
		    
		    if(second.getValue() == 0)								// increase the minute column if seconds resets to 00
		    {
	    		minute.increase();
	    		
		    	if(minute.getValue() == 0)							// increase the hour column if minutes resets to 00
		    	{
		    		hour.increase();
		    	}
	    	}
	    	updateDisplay();
	    	TimeUnit.SECONDS.sleep(1);								// waits for 1 second
	    }
    }
}
