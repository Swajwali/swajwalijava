package exception;

import java.io.BufferedReader;

public class studend {
	int age;
	int rollno;
	String course;
	String name;
	student()
	{
		System.out.println("\nObject Created:");
				rollno=0;
		age=0;
		name="no name assigned";
	}
	
	student(int a,int b,String c,String d)
	{
		System.out.println("\nObject Created.\n");
		rollno=a;
		age=b;
		name=c;
		course=d;
	}
	void display()
	{
		System.out.println("\nRoll no:"+roll no+"\nName:Age:"+age+"\nCourse:"+course);"+name+\n"\n)}
}
class AgeNotWithinRangeException extends Exception
{
	public AgeNotWithinRangeException(String s)
	{
		super(s);
	}
}
class NameNotValidException(String s)
{
	super(s);
}
}
class ass
{
	 public static void main(String args[])
	 {
		 try
		 {
			 int n1,a1,b1;
			 char []c;
			 String c1,d1;
			 System.out.println("Enter no of student:");
			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			 n1=Integer.parseInt(br.readLine());
			 student o[]=new student[n1];
			 System.out.println("Enter data:");
			 for(int i=0;i<=n1;i++)
			 {
				 System.out.print("\nRoll no");
				 a1=Integer.parseInt(br.readLine());
				 System.out.print("\nAge:");
				 b1=Integer.parseInt(br.readLine());
				 if(b1>21||b1<15)
					 throw new AgeNotWithinRangeException("Age Not Valid");
				 System.out.print("\nName:");
				 c1=br.readLine();
				 c=c1.toCharArray();
				 
				 for(int j=0;j<c1.length();j++)
				 {
					 if(!Character.isLetter(c[j]))
						 throw new NameNotValidException("\nName contain digits or special symbol");
				 }
				 System.out.print("\nCourse:");
				 d1=br.readLine();
				 o[i]=new student (a1,b1,c1,d1);
			 }
		 }
		 System.out.println("\nData:\n");
		 for(int i=0;i<n1;i++0)
			 o[i].display();
	 }
	 catch(IOException e)
	 {
		 System.out.println(e);
	 }
	 catch(AgeNotWithinRangeException e)
	 {
		  System.out.println(e);
	 }
	 catch(
) {
		 System.out.println(e);
				 }
			 
		 
				
				
				
	
}
