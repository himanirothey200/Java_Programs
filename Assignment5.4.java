import java.util.*;
import java.lang.*;

class Assignment4
{
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
	public static void main(String[] args)
	{
		int a;
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		Assignment4 obj = new Assignment4();
		
		
		obj.SumNonFactor(a);
		
	}
}