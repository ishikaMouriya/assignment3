
import java.util.*;

public class ass3q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n ;
		System.out.println("enter a number");
		n=sc.nextInt();
		try {
		if(n<0) {
			throw new NumberFormatException("negative number");
			//throw keyword will crash the entire main thread
			//unable for the program to execute further
		}
		System.out.println("the number is lucky 8"
				+ ""+n);}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		}

	}


