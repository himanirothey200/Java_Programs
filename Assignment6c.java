import java.util.*;
import java.lang.*;

class Assignment6c
{
	public int CountTwo(int iNo)
	{
		int counter=0;
		
		
		while(iNo>0)
		{
			int idigit=0; 
			idigit=iNo%10;   //2395%10= 239   iDigit = 5
			
			if(idigit == 2)
			{
				
				counter++;
				System.out.print("digit");
			} 
			iNo=iNo/10;
			
		}
		return counter;
		
	}
	
	public static void main(String[] args)
	{
		int iValue = 0;
		int bRet = 0;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		iValue = sc.nextInt();
		
		Assignment6c obj = new Assignment6c();
		bRet = obj.CountTwo(iValue);
		System.out.print(bRet);
		
	}
}