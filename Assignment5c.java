import java.util.*;
import java.lang.*;

class Assignment5c
{
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
	public static void main(String[] args)
	{
		int a;
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		Assignment4 obj = new Assignment4();
		
		
		obj.NonFactor(a);
		
	}