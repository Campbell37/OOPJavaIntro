/**
 * @author Sol Campbell 17010688
 * @version 1
 *Room.java reservationSysV1
 */
package reservationSysV1;

public class Room 
{
	private int roomNo;
	private Customer occupier;
	private boolean status;

	public Room()
	{
		
	}
	
	public Room(int rnos)
	{
		roomNo = rnos;
		status = true; 
	}
	
	public void display()
	{
		System.out.println("Room number: "+roomNo);
		
		if (status==true)
		{
			System.out.println("Room is free");
		}
		
		else
		{
			occupier.display();
		}	
		
		System.out.println("");
	}
	
	public void bookroom(Customer newperson)
	{
		if (status==true)
			{
			status = false;
			occupier = newperson;
			}
		
		else
		{
			System.out.println("Sorry room booked");
			System.out.println("");
		}
	}
	
	public void bookroom()
	{
		System.out.println("Room "+roomNo);
		System.out.println("");
	
		if (status==true)
		{
			Customer newperson = new Customer();
			newperson.getName();
			newperson.getEmail();
			status = false;
			occupier = newperson;
		}
	
		else
		{
			System.out.println("Sorry room booked");
			System.out.println("");
		}
	}
	
	public void cancelRoom()
	{
		status = true;
		occupier = null;
		System.out.println("Room cancelled");
		System.out.println("");
	}
	
	public int returnRoomNos()
	{
		return(roomNo);
	}

}

