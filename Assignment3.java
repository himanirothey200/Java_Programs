import java.lang.*;
import java.util.*;


class Assignment3
{
	
	public int PrintEven(int iValue)
	{
		int i;
		for(i=2;iValue>0;i=i+2)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			iValue--;
			
		}
		return i;
	}
	
	public void PrintFactor(int iVal)
	{
		int i=0;
		for(i=1;i<=iVal;i++)
		{
			if(iVal%i ==0)
			{
				System.out.println(i);
			}
			
			
		}
		
	}
	
	public void DisplayConvert(char ch)
	{ 
	
	       if(ch>=65 && ch<=90)
		   {
             System.out.println(Character.toLowerCase(ch));
		   } 
		   else if(ch>97 && ch<=122)
		   {
			   System.out.print(Character.toUpperCase(ch));
		   }
		
	}
	
	public void Vowel(char ch)
	{
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.print("It is vowel");
			
	    }else
        {
			System.out.println("It is consonant");
		}			
	}
	
	
	public static void main(String[] arg)
	{
		int a;
		
		char ch = '\0';
		/*System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		Assignment3 obj = new Assignment3();
		
		//obj.PrintEven(a);
		
		obj.PrintFactor(a);*/
		
		System.out.println("Enter Character");
		Scanner sc = new Scanner(System.in);
		
		ch = sc.next().charAt(0);
		
		Assignment3 obj = new Assignment3();
		
		//obj.DisplayConvert(ch);
		
		obj.Vowel(ch);
		
	}
}

