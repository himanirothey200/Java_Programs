import java.util.*;
import java.lang.*;

class Assignment5b{
	
	public int DecreasingOrder(int no)
	{
		int iNo=0;
		int i=0;
		int prod=1;
		
		 for(i=1;i<=no;i++)
		 {
			 if(no%i==0)
			 {
		         prod = no/i;
                 System.out.print(prod);				 
			 }
			 
		 }
		 return prod;
	}
	public static void main(String[] args)
	{
		int a;
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		Assignment4 obj = new Assignment4();
		
		
		obj.DecreasingOrder(a);
		
	}
}