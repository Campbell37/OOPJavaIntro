/*
 * Sol Campbell 17010688 02/10/2018
 * Driver Class
 */
package clockV1;

import java.util.Scanner;

public class DisplayTime 
{
	
	public static void main(String[] args)  throws InterruptedException 		// allows the second interval to work
	{
		Scanner kboard = new Scanner(System.in);
		int time1 = 0;
		int time2 = 0;
		int time3 = 0;
		
		System.out.println("Please enter the time as requested.");				// user prompt for time 
		System.out.println("Hour.");
		time1 = kboard.nextInt();
		System.out.println("Minute.");
		time2 = kboard.nextInt();
		System.out.println("Sec.");
		time3 = kboard.nextInt();
		
		ClockDisplay display = new ClockDisplay(time1, time2, time3);
		display.timeCount();													// displays the time, and because of for loop in ClockDisplay, counts for hour
		
		kboard.close();
	}
}