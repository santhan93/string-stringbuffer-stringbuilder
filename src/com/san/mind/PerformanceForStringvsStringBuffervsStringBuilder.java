package com.san.mind;
//*The hash code clearly shows that when we use a string class to edit 
//* or add some value to a string then JVM creates one object for every instance of the change But for the 
//* String Buffer class it a single memory location is allocated i.e. 
//*only one object is created and allocated even if u amend the string 100 times.

public class PerformanceForStringvsStringBuffervsStringBuilder {
	
	public static String Stringperf()
	{
		String a = "Santhan";
		System.out.println(a.hashCode());
		for(int i=0; i<=100; i++)
		{
			a = a+" Rao";	
			System.out.println(a.hashCode());
		}
		return a;
	}
	public static String StringBufferperf()
	{
		StringBuffer b = new StringBuffer("Santhan");
		System.out.println(b.hashCode());
		for(int i=0; i<=100; i++)
		{
		b.append(" Rao");
		System.out.println(b.hashCode());
		}
		return b.toString();
	}
	
	public static String StringBuilderperf()
	{
		StringBuilder c = new StringBuilder("Santhan");
		System.out.println(c.hashCode());
		for(int i=0;i<=100;i++)
		{
			c.append(" Rao");
			System.out.println(c.hashCode());	
		}
		return c.toString();
	}

	public static void main(String[] args) {
		
		long starttime = System.currentTimeMillis();
		Stringperf();
		System.out.println("Time taken for stringmethod :"+(System.currentTimeMillis()-starttime)+"ms");
		starttime = System.currentTimeMillis();
		StringBufferperf();
		System.out.println("Time taken for stringBuffermethod :"+(System.currentTimeMillis()-starttime)+"ms");
		starttime = System.currentTimeMillis();
		StringBuilderperf();
		System.out.println("Time taken for stringBuilder method :"+ (System.currentTimeMillis()-starttime)+"ms");
	}

}
