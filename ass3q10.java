import java.util.Scanner;

public class ass3q10 {

	public static String rev(String s,int l)
	{
		if((s.length())==0)
		return (" ");
		else
			return(s.charAt(s.length()-1)+rev(s.substring(0,s.length()-1),s.length()-1));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("enter a string");
		s=sc.nextLine();
		System.out.println(rev(s,s.length()));
		

	}

}
