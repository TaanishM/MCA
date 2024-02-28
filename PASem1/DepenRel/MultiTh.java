package DepenRel;
import java.lang.Thread;

public class MultiTh extends Thread{    
	public void run()
	{    
		for(int i=1;i<5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println("e");
			}
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);    
		}    
    }
    public static void main(String args[])
    {    
    	MultiTh t1=new MultiTh();    
    	MultiTh t2=new MultiTh();    
        
    	t1.start();
    	t1.setName("T1");
    	t2.start();
    	t2.setName("T2");
    }
}
   