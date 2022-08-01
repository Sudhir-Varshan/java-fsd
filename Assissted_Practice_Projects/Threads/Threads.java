package assignment_2;

public class Threads extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		Thread mt = new  Thread();
  		mt.start();
 	}
}
