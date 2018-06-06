
//PROGRAM TO CALCULATE SUM OF 10 ELEMENTS ENTERED BY THE USER.

import java.util.Scanner;
class Sum
{
   public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   int d[]=new int[10];                      //INITIALISE AN ARRAY
   int n=d.length;
   int sum=0;
   System.out.println(" ENTER 10 ELEMENTS");
   for(int i=0;i<n;i++)
{                                           //INPUT 10 ELEMENTS 
   d[i]=sc.nextInt();
}
   for(int i=0;i<n;i++)
{                                           //SUM OF 10 ELEMENTS
   sum=sum+d[i];
}
   System.out.println(" SUM IS  "+ sum);
}
}