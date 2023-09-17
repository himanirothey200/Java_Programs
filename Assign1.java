import java.util.*;
import java.lang.*;

class Assign1
{
	/* public static int Divide(int iNo1,int iNo2)
	{
		/*int iAns = 0;
		
		iAns = iNo1/iNo2;
		return iAns;
		
		
		
	}
	
	public static void Display()
	{
		int i=0;
		for(i=1;i<=5;i++)
		{
			System.out.println("Marvellous");
		}
	}*/
	
	/*public static void Display1()
	{
		int i=0;
		for(i=5;i>=1;i--)
		{
			System.out.println(i);
		}
	}
	
	public static void Display1(int iValue)
	{
		int i=0;
		for(i=0;i<iValue;i++)
		{
			System.out.println("*");
		}
	}
	
	
	public static void Display1(int iValue)
	{
		if(iValue%5==0)
		{
			System.out.println("It is divisible by 5");
		}
		else
			
			{
				System.out.print("It is not disvisible by 5");
			}
	}
	
	public static void Display1(int iValue)
	{
		 if(iValue<10)
		 {
			 System.out.print("Hello");
		 }
		 else
	     {
			 System.out.println("Demo");
		 }		 
	}
	
	public static void Display1(int iValue,int freq)
	{
		int i = 0;
		
		for(i=0;i<freq;i++)
		{
			System.out.println(iValue);
		}
	}
	
	public static void Display1(int iValue)
	{
		if(iValue%2==0)
		{
			System.out.print("Ti is even number");
		}
		else
		{
			System.out.println("It is odd ");
		}
	}
	
	public static int Display1(int iValue)
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
	
	public static int printEven(int iVal)
	{
		int i =0;
		for(i=1;i<=iVal;i++)
		{
			if(iVal%i==0)
			{
				System.out.println(i);
			}
		}
		return i;
	}
	
	public static void  DisplayConvert(char ch)
	{
		 
		if(ch>=65 && ch<=90)
		{
			System.out.println(Character.toLowerCase(ch));
		}
		else if(ch>=97 && ch<=122)
		{
			System.out.println(Character.toUpperCase(ch));
		}
	}
	
	
	public static void  Vowel(char ch)
	{
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.print("It is vowel");
		}
		else 
		{
			System.out.print("It is not vowel");
		}
	}
	
	public static int MultFact(int iNo)  //8
	{
		int prod =1;
		int i=0;
		for(i=1;i<iNo;i++)   
		{
			if((iNo%i)==0)
			{
				prod = (prod * (iNo/i)); 
			}
		}
		System.out.println(prod);
		
		return prod;
	}*/
	
	
	public static int DecreasingOrder(int iNo)
	{
		int i;
		int prod = 1;
		for(i=1;i<=iNo;i++)
		{
			if(iNo%i==0)
			{
				prod = iNo/i;
				System.out.print(prod);
			}
		}
		return prod;
	}
	
	
	
   public static void main(String[] args)
   {
	   
	   int no;
	   int frequency;
	   char ch;
	   /*int iRet=0;
        int no =0;
		int no1 = 0;
		System.out.println("Enter the number1: ");
		Scanner sc = new Scanner(System.in);
		 no = sc.nextInt();
		
		System.out.println("Enter the number2: ");
		 no1 = sc.nextInt();
		 

		 Assignment1 obj = new Assignment1();
		
	      iRet = Divide(no,no1);
		
		System.out.println("Division is:"+iRet);*/
		
		//Display1();
        
        /* System.out.println("Enter the number: ");
         Scanner sc = new Scanner(System.in);		 
		
		no = sc.nextInt();
		
		//System.out.print("Enter the number of frequency");
		
		
		//frequency = sc.nextInt();
		
		printEven(no);*/
		
		/*System.out.println("Enter the character: ");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		
		//DisplayConvert(ch);
        Vowel(ch);		*/
		
		
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		
		no = sc.nextInt();
		
		DecreasingOrder(no);
        
   }
}