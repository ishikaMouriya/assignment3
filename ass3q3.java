import java.util.*;
import java.io.*;
class MarksOutOfBoundException extends Exception
{ 
	public MarksOutOfBoundException(String s)
	{super(s);}
}
public class ass3q3 {
            String name;int mark;
            ass3q3(String name,int mark)throws  MarksOutOfBoundException
            {
           this.name=name;
           this.mark=mark;
          /* if(mark>100)
        	   throw new MarksOutOfBoundException("marks can't be greater than 100");
           else
        	   System.out.println("name");*/
            }
            public  void m()throws MarksOutOfBoundException
            {
					if (mark>100)
						throw new MarksOutOfBoundException("marks can't be greater than 100");
					else
						System.out.println(name+" has got"+mark);
				
				
            }
	public static void main(String[] args) throws MarksOutOfBoundException
	{
		Scanner sc=new Scanner(System.in);
		String na;int ma;
		System.out.println("enter name");
		na=sc.nextLine();
	    System.out.println("enter marks");
	    ma=sc.nextInt();
	    ass3q3 obj=new ass3q3(na,ma);
	   try {
		  
		   obj.m();
	   }
	   catch(MarksOutOfBoundException e)
	   {
		   System.out.println(e.toString());
	   }

	}

}
