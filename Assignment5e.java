import java.util.*;
import java.lang.*;

class Assignment5e
{
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
}
		public static void main(String[] args)
	{
		int a;
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		Assignment4 obj = new Assignment4();
		
		
		obj.Differnce(a);
	}
}