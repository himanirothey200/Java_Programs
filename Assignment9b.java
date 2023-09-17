import java.lang.*;
import java.util.*;

class Assignment9b
{
	
	public static void Display(int Arr[])
	{
		int even = 0; 
		int odd = 0;
		int difference = 0;
		int iLength = Arr.length;
		
		for(int i=0;i<iLength;i++)
		{
			if(Arr[i]%2 !=0)
			{
				odd++;
			}
			else
			{ 
			    even++;
			}
			
			difference = even - odd;
		}
		System.out.print("Difference between frequency of even number and odd numbers : " + difference);
		
	}
	
	public static void main(String[] args)
	{
		int iSize =0;
		int iCnt;
		int[] p = null;
		System.out.println("Enter the number of elements");
		Scanner sc = new Scanner(System.in);
		
		iSize = sc.nextInt();
		
		p = new int[iSize];
		
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			System.out.println("Enter elements : "+ (iCnt+1) + "");
			
			p[iCnt] = sc.nextInt();
		}
		
		Display(p);
		
		
	}
}	
	