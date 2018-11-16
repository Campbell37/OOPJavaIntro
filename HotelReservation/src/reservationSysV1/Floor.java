/**
 * @author Sol Campbell 17010688
 * @version 1
 *Floor.java reservationSysV1
 */
package reservationSysV1;

import java.util.Scanner;

public class Floor 
{
	private int floornumber;
	Room rooms[] = new Room[4];
	Scanner kboard = new Scanner(System.in);

	public Floor(int nos)
	{
		floornumber = nos;
		
		Room r1 = new Room(1);
		Room r2 = new Room(2);
		Room r3 = new Room(3);
		Room r4 = new Room(4);
		
		rooms[0] = r1; 
		rooms[1] = r2; 
		rooms[2] = r3; 	
		rooms[3] = r4;
	}
	
	public void displayFloor()
	{
		System.out.println("Floor: "+floornumber);
		System.out.println("");
		for(int counter=0; counter<rooms.length; counter++)
		{
			rooms[counter].display();			
		}
	}
	
	public void findaRoomtoBook()
	{
		int nos; 
		int counter=0; 
		boolean found = false;
		
		System.out.println("Please enter room number: ");
		nos = kboard.nextInt();
		
		for (counter=0; counter < rooms.length; counter++)
		{
			if (nos == rooms[counter].returnRoomNos())
			{
				found = true;
				rooms[counter].bookroom();
				break;
			}
		}
		
		if (found == false) 
		{
			System.out.println("No such room number");
			System.out.println("");
		}
	}
	
	public void findaRoomtoCancel()
	{
		int nos;
		int counter=0;
		boolean found = false;
		
		System.out.println("Please enter room number: ");
		nos = kboard.nextInt();
		
		for (counter=0; counter < rooms.length; counter++)
		{
			if (nos == rooms[counter].returnRoomNos())
			{
				found = true;
				rooms[counter].cancelRoom();
				break;
			}
		}
		
		if (found == false)
		{
			System.out.println("No such room number");
			System.out.println("");
		}
	}
	
	public void closekboard()
	{
		kboard.close();
	}
}
