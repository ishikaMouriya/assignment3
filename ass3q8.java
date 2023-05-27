import java.util.*;
public class ass3q8 {
public static int rev(int n,int i)
{ 
	//if(n==0)
	int y=(Integer.toString(n)).length();
	if((i== y)||(n==0))
		return 0;
	else
		return(((n%10)*(int)Math.pow(10, y-1))+(rev(n/10,i+1)));
}
public static void main(String args[])
{
	Scanner cs=new Scanner (System.in);
	int num;
	System.out.println("enter a number");
	num=cs.nextInt();
	System.out.println(rev(num,0));
	
	
}
}
