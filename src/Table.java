
// PRINT TABLE OF A NUMBER.

import java.util.Scanner;
class Table
{
   public static void main(String args[])
  { 
     Scanner sc=new Scanner(System.in);
     System.out.println(" ENTER NO : ");
     int n=sc.nextInt();
     for(int i=1;i<=10;i++)
     {
       int t=i*n;
       System.out.println(n+"*"+i+"="+t);
     }
  }
}