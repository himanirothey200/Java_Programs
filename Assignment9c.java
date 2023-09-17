import java.lang.*;
import java.util.*;

class Assignment9c
{
	
	public static void Display(int Arr[])
	{
		int even = 0; 
		int odd = 0;
		int iLength = Arr.length;
		
		for(int i=0;i<iLength;i++)
		{
			if(Arr[i] == 11)
			{
		        System.out.println("11 is present");	
			}
			
			
		}
		
		
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