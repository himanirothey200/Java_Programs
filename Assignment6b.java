import java.util.*;
import java.lang.*;

class Assignment6b
{
	public void chkZero(int no)
	{
		
		int i=0;
		
		          //2500%10=250   121%10
		
			if(no%10==0)
			{
				System.out.print("It contains zero");
			}
			else
			{
				System.out.print("It does not contain zero");
			}
		
	}
	
	
	public static void main(String[] args)
	{
		int a=0;
		System.out.print("Enter the Value");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		Assignment6b obj = new Assignment6b();
		obj.chkZero(a);
	}
}

