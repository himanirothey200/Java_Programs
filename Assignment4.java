import java.util.*;
import java.lang.*;

class Assignment4{
	
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
	public int NonFactor(int no)
	{
		int i=0;
		for(i=1;i<=no;i++)
		{
			if((no%i)!=0)
			{
				System.out.print(i);
			}
			
		}
		return i;
	}
	public int SumNonFactor(int no)
	{
		int i=0;
		int sum=0;
		for(i=1;i<=no;i++)
		{
			if((no%i)!=0) // 12%5
			{
				
				{
					sum = (sum + i);
					
				}
			}
			
			
		}
		System.out.print(sum);
		return sum;
		
	}
	public int Differnce(int no)
	{
		int i=0;
		int j=0;
		int sum1 = 0;
		int sum2 = 0;
		int sum = 0;
		
		for(i=1;i<no;i++)   //no = 12 
		{
			
				if(no%i !=0)
				{
					sum1 = sum1 + i;
				}
				else
					
				{
						sum2 = sum2 + i;
				}
				 
				 sum = sum2 - sum1;
			
		}
		System.out.print(sum);
		return sum;
	}
	public static void main(String[] args)
	{
		int a;
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		Assignment4 obj = new Assignment4();
		
		//obj.MultiFact(a);
		//obj.DecreasingOrder(a);
		//obj.NonFactor(a);
		//obj.SumNonFactor(a);
		obj.Differnce(a);
	}
}