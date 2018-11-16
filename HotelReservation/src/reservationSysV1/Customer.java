/**
 * @author Sol Campbell 17010688
 * @version 1
 *Customer.java reservationSysV1
 */
package reservationSysV1;

import java.util.Scanner;
public class Customer 
{
	private String customerName;
	private String customerEmailAddress;
	Scanner kboard = new Scanner(System.in);
	
	public Customer()
	{
		
	}
	
	public Customer(String cName, String cEmailAddress)
	{
		customerName = cName;
		customerEmailAddress = cEmailAddress;
	}
	
	public void display()
	{
		System.out.println("Details are "+customerName+ " "+customerEmailAddress);
	}

	public void getName()
	{
		System.out.println("Please enter your name");
		customerName = kboard.nextLine();
	}
	public void getEmail()
	{
		System.out.println("Please enter your contact details");
		customerEmailAddress = kboard.nextLine();
	}
	
	public void closekboard()
	{
		kboard.close();
	}
}
