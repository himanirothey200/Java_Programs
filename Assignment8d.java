import java.lang.*;
import java.util.*;

class Assignment8d
{
	
	public static void Display(int Arr[])
	{
		
		int iLength = Arr.length;
		for(int i=0;i<iLength;i++)
		{
			if(Arr[i]%3==0 && Arr[i]%5==0)
			{
				System.out.println(Arr[i]);
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