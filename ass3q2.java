import java.util.Scanner;

public class ass3q2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		String a[]=new String[4];
		System.out.println("enter 4 colors");
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextLine();
		}
		System.out.println("convert string to integer");
		try {
			Integer.parseInt(a[0]);
			
		}catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		String s;
		System.out.println("enter  one more color");
		s=sc.nextLine();
		try {
			a[5]=s;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println(e);	
		}
		System.out.println("the colours entered are-");
		for(int i=0;i<4;i++)
		{
			System.out.println(a[i]+" ");
		}

	}

}
