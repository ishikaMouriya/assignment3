import java.util.Scanner;

public class ass3q9 {

	public static int fibo(int n)
	{
		if(n==1)
			return 1;
		if(n==2)
			return 1;
		else
			return(fibo(n-2)+fibo(n-1));
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter number");
		num=sc.nextInt();
		System.out.println("the "+num+" number in the fibonacci series is "+fibo(num));

	}

}
