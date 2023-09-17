import java.util.*;
import java.lang.*;

class Assignment5
{
	
	public int MultiFact(int no)
	
    {
		int prod=1;
		int i=0;
		int no1=0;    //no=8
		for(i=1;i<no;i++)
		{
			if((no%i)==0)     //8%1 8%2 8%4 8%8
			{
				prod = (prod * (no/i));   //1*8 8*4  32*2 64*1          1*2*4*8=64
                  				
				
			}
			
			
		}
		System.out.println(prod);
		return prod;
	}	
	public static void main(String[] args)
	{
		int a;
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		Assignment4 obj = new Assignment4();
		
		obj.MultiFact(a);
		
		
	}
}