import java.util.Scanner;

class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of elemetns to be inserted:");
		int no=sobj.nextInt();
		
		MyMap<Integer,String> obj=new MyMap<Integer,String>();
		
		long endTime;
		long startTime;
		
		startTime=System.nanoTime();
		 
		for(int i=1;i<no;i++)
		{
			obj.insert(i,"Krishagni");
		}
		
		 endTime=System.nanoTime();
		 
		 System.out.println("Required time for insertion in my Map : "+ (endTime-startTime)/1000000000+" seconds");
	}
}