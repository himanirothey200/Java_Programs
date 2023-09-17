import java.util.*;
import java.lang.*;

class Assignment8a
{
	public static void Difference(int Arr[])
	{
		
        int iLength = Arr.length;
		int evenSum = 0;
		int oddsum = 0;
        for (int i = 0; i < iLength; i++) 
		{
            if ((Arr[i] % 2 == 0))
            {
				
                evenSum += Arr[i];
            }
			else
				
				{
					oddsum += Arr[i];
				}
	    }	
        
         int difference = evenSum - oddsum;	
System.out.println("Difference between even and odd sums: " + difference);		 
	}
	
	
	
	public static void main(String args[])
	{
		int iSize = 0;
		int iCnt;
		
		int[] p = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter number of elements: ");
		iSize = sc.nextInt();
		
		p = new int[iSize];
		
		for(iCnt = 0;iCnt<iSize; iCnt++)
		{
			System.out.println("Enter elements + "+(iCnt+1) + " " );
			p[iCnt] = sc.nextInt();
		}
		
		Difference(p);
		
	}
}