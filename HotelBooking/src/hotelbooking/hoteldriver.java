package hotelbooking;

public class hoteldriver 
{
	public static void main(String[] args)
	{
		hotel h1 = new hotel(101,"The Grand");
		
		h1.display();
		h1.bookARoom();
		h1.display();
		h1.CancelARoom();
		h1.display();
	}
}
