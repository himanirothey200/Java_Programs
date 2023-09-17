import java.util.*;
import java.lang.*;

class Assignment7a
{
	public int CountEven(int iNo)
	{
		int idigit=0;
		
		while(iNo>0)
		{
			if(iNo%10==0)
			{
				idigit = iNo%10;
			if((idigit%2)==0)    
			{
				int counter = 0;
				counter++;
			}
			
			}
			iNo=iNo/10;   
		}
		return counter;
	}
	
	public static void main(String[] args)
	{
		int iValue = 0;
		int iRet = 0;
		
	     System.out.print("Enter the number");
		 Scanner sc = new Scanner(System.in);
		 
		 Assignment7a obj = new Assignment7a();
		 iRet = obj.CountEven(iValue);
		 System.out.print(iRet);
	}
}