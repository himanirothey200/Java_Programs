import java.util.*;
import java.lang.*;

class Assignment10a
{

   public static void Display(int Arr[],int No)
   {
        int iLength = Arr.length;
		int frequency = 0;
		
		for(int i=0;i<iLength;i++)
		{
			if(Arr[i] == No)
			{
				System.out.println("Number is present");
			}
			else
			{
				System.out.println("Number is not present");
			}
		}
		
	
   }
   
   
   
public static void main(String[] args)
{

     int iSize=0;
	 int[] p = null;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of elements: ");
	 
	 iSize = sc.nextInt();
	 p = new int[iSize];

    for(int iCnt = 0;iCnt<iSize;iCnt++)
	{
	     System.out.println("Enter elements: " + (iCnt+1) +  "");
		 p[iCnt] = sc.nextInt();
		 
	
	}
	System.out.println("Enter the number: ");
		 int no = sc.nextInt();
		 Display(p,no);



}

}