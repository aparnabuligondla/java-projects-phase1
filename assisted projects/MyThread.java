package ap1;

public class MyThread extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread running!!");
}
 	public static void main( String args[] )
 	{
  		MyThread mt = new  MyThread();
  		mt.start();
 	}
}
