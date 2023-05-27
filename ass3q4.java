import java.util.*;
public class ass3q4 
{
	public static <u> void printArray(u[] inputArray)
{ 
		System.out.println("the array is as folows=");
	for(int i=0;i<inputArray.length;i++)
	{
		System.out.print(inputArray[i]+" ");
		
	}
	System.out.println();
	
}
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int n;System.out.println("enter the number of elements");
		n=sc.nextInt();
		Integer a[]=new Integer[n];
		System.out.println("enter integer array elemnts");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		printArray(a);
		Double b[]=new Double[n];
		System.out.println("enter double array elemnts");
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextDouble();
		}
		
		printArray(b);
		
		
	}

}
