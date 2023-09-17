import java.util.*;
import java.lang.*;

class Assignment1
{
	public int Divide(int iNo1,int iNo2)
	{
		int iAns = 0;
		
		iAns = iNo1/iNo2;
		return iAns;
	}
	
	
   public static void main(String[] args)
   {
	   int iRet=0;
        int no =0;
		int no1 = 0;
		System.out.println("Enter the number1: ");
		Scanner sc = new Scanner(System.in);
		 no = sc.nextInt();
		
		System.out.println("Enter the number2: ");
		 no1 = sc.nextInt();
		 
		 Assignment1 obj = new Assignment1();
		
		iRet = obj.Divide(no,no1);
		
		System.out.println("Division is:"+iRet);
        
   }
}