import java.util.*;
import java.lang.*;

class Assignment6d
{
	public int countFour(int iNo)
	{
		int counter = 0;
		while(iNo>0)
		{
			int idigit = 0;
		     idigit = iNo%10;
			if(idigit<6)    //144%10=14  4
			{
				
				counter++;
			}
			iNo=iNo/10;   //144/10=14 
		}
		return counter;
	}
	
	public static void main(String[] args)
	{
		int iValue = 0;
		int iRet = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		iValue = sc.nextInt(); 
		
		Assignment6d obj = new Assignment6d();
		
	     iRet =	obj.countFour(iValue);
		 System.out.print(iRet);
		
	
	}
}