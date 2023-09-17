import java.util.*;
import java.lang.*;

public class Assignment10b
{
	public static int getFirstOccurrenceIndex(int Arr[],int target)
	{
		
		for(int i = 0;i<Arr.length;i++)
		{
			if(Arr[i] == target)
			{
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args)
	{
		int iLength=0;
		int []p = null;
		int firstIndex;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		
		
		 iLength = sc.nextInt();
		 
		 System.out.println("Enter the elements: " +   " ");
					p = new int[iLength];

		
		for(int i=0;i<iLength;i++)
		{
			
			 
			 p[i] = sc.nextInt();
			 
			 	
		}
		
		System.out.println("Enter the target number");
		
		int target = sc.nextInt();
		
		
		firstIndex = getFirstOccurrenceIndex(p,target);
		
		if (firstIndex!= -1)
		{
			System.out.println("First Occurence of " + target + "is at index" + firstIndex);
		}
		else
		{
			System.out.println(target + "was not found at the index");
		}	
		
		
		
		
	}
}





