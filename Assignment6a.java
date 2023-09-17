import java.util.*;
import java.lang.*;

class Assignment6a{
	
		public static void main(String[] args)
	{
		int a;
		System.out.print("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		Assignment6a obj = new Assignment6a();
		
		obj.DisplayDigit(a);
		
	}
	
	public int DisplayDigit(int no)
	{
		 int i = 0;
		 int reversed = 0;
		 for(i=1;i<no;i++)
		 {
			 while(no!=0)
			 {
				
            int digit = no % 10; 
            reversed = reversed * 10 + digit; 
            no /= 10;  
			 }
		 }
		 System.out.print(reversed);
		 return reversed;
		 
		 
	}



}