
// ENTER NUMBERS IN AN ARRAY , CHECK FOR EVEN NUMBERS AND ADD THEM IN STACK.

import java.util.*;
class StackDemo
{
public static void main(String... args)
{  Stack<Integer> mystack=new Stack<Integer>();
   Scanner sc=new Scanner(System.in);
   System.out.println(" ENTER INTEGER VALUES : ");
   int arr[]=new int[10];
   int sum=0;
   for(int i=0;i<10;i++)
{
	arr[i]=sc.nextInt();
}
   
 for(int i=0;i<10;i++)
{
	if((arr[i]%2)==0)
	{
		mystack.push(arr[i]);
	}
}
	 		System.out.println(mystack);
	 		while(!mystack.empty())
	 		{
	 			sum=sum+mystack.pop();
	 		}
	System.out.println(" SUM IS : "+sum); 		
}
}
