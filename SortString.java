
// PROGRAM TO SORT STRING.

import java.util.*;
class SortString
{
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" HOW MANY STRINGS YOU WANT TO ENTER : ");
		int c=sc.nextInt();
		int n;
		String temp;
		String arr[]=new String[c];
		for(int j=0;j<c;j++)                              // ENTER ARRAY OF STRINGS
		{
			System.out.println(" ENTER THE "+(j+1)+" ELEMENT ");
			arr[j]=sc.next();
		}
		for(int i=0;i<c;i++)
		{
			for(int k=i+1;k<c;k++)
			{
                n=arr[i].compareTo(arr[k]);               // COMPARE AND SWAP
                if(n>0)
				{
                    temp=arr[i];
                    arr[i]=arr[k];
                    arr[k]=temp;
				}
			}
		}
        System.out.println(" SORTED STRINGS ARE ");
            for(int i=0;i<c;i++)
         {
            System.out.println(arr[i]);
	      }
		}
	}
	