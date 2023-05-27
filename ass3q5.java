import java.util.Scanner;

public class ass3q5 {

	public static <T> int count(T[] array,T item)
	{  int c=0;
	for(int i=0;i<array.length;i++)
	{
		if((array[i]==item)||(array[i].equals(item)))
			c++;	
	}
	return c;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;System.out.println("enter the number of elements");
		n=sc.nextInt();
		Integer a[]=new Integer[n];
		System.out.println("enter integer array elemnts");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Integer m;
		System.out.println("enter the element to be searched");
		m=sc.nextInt();
		int y=count(a,m);
		System.out.println("the total "
				+ "number of times the element is present on the array is="+y);

	}

}
