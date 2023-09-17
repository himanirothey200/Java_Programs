import java.util.*;
import java.lang.*;

class Assignment8b{
	
	public static void Display(int Arr[])
	{
		int iLength = Arr.length;
		for(int i=0;i<iLength;i++)
		{
			if(Arr[i]%5==0)
			{
				System.out.println(Arr[i]);
			}
		}
	}
	
	
	public static void main(String args[])
	{
		
		int iCnt;
		int iSize = 0;
		int[] p = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		
		iSize = sc.nextInt();
		
		p = new int[iSize];
		
		for(iCnt = 0;iCnt<iSize; iCnt++)
		{
			System.out.println("Enter elements + "+(iCnt+1) + " " );
			p[iCnt] = sc.nextInt();
		}
		
		Display(p);
		
		
	}
}