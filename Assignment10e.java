import java.util.*;
import java.lang.*;

class Assignment10e
{
	
	public static int Product(int Arr[])
	{
		int product = 1;
		
		for(int i = 0;i<Arr.length;i++)
		{
			if((Arr[i]%2)!=0)
			{
			   product=	product *  Arr[i];
			}
		}
		return product;
	}
	
	
	public static void main(String[] args)
	{
		int iLength;
		int getValue;
		
		int []p = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		iLength = sc.nextInt();
		p = new int[iLength];
		
		System.out.println("enter the elements: ");
		
		for(int i=0;i<iLength;i++)
		{
			p[i] = sc.nextInt();
		}
		
	  getValue = Product(p);
	  
	  
	  System.out.println("product of odd elements: " + getValue);
		
		
	}
}