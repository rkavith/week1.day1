package Selenium.week1.day1;

public class Mobile {

	public void sendMsg()
	{ 
		String msg = "Message Sent"; 

		System.out.println(msg);
	}
	public void makeCall() 
	{
		System.out.println("Calling....");

	}
	public void saveContacts()
	{
		System.out.println("Contact Saved");
	}
	public static void main(String[] args)
	{
		Mobile obj = new Mobile();
		obj.sendMsg();
		obj.makeCall();
		obj.saveContacts();
	}
}