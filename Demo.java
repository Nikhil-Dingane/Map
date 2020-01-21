class Demo
{
	public static void main(String arg[])
	{
		MyMap<Integer,String> bobj=new MyMap<Integer,String>();
		
		long endTime;
		long startTime;
		
		startTime=System.nanoTime();
				
		for(int i=0;i<1000;i++)
		{
			bobj.put(i,"krishagni");
		}
		
		endTime=System.nanoTime();
		
		System.out.println("Required time for insertion in inbuilt vector is : "+ (endTime-startTime)/1000000000+" seconds");
		bobj.display();
	}
}