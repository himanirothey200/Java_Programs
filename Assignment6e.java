import java.util.*;
import java.lang.*

class Assignment9e
{

   public static void Display(int Arr[],No)
   {
        int iLength = Arr.length;
		int No;
		
		for(int i=0;i<iLength;i++)
		{
			if(Arr[i] == No)
			{
				frequency++;
			}
		}
		System.out.print("Frequency of number is : " + frequency);
   }
   
   
   
public static void main(String[] args)
{

     int iSize=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of elements: ");
	 
	 iSize = sc.nextInt();

    for(int iCnt = 0;iCnt<iSize;iCnt++)
	{
	     System.out.println("Enter elements: " + (iCnt+1) + : "");
		 p[iCnt] = sc.nextInt();
		 
		 System.out.println("Enter the number: ");
		 int no = sc.nextInt();
		 Display(p,no);
	
	}


}




}