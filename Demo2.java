import java.util.*;

class Demo2
{
	public static void main(String arg[])
	{
		TreeMap<Integer,String> tobj=new TreeMap<Integer,String>();
		
		long endTime;
		long startTime;
		
		startTime=System.nanoTime();
				
		for(int i=0;i<100000;i++)
		{
			tobj.put(i,"krishagni");
		}
		
		endTime=System.nanoTime();
		
		System.out.println("Required time for insertion in inbuilt vector is : "+ (long)((endTime-startTime)/1000000000)+" seconds");
		System.out.println("TreeMap: "+ tobj); 
	}
}