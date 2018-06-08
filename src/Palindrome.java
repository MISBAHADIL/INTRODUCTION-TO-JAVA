
//CHECK WHETHER THE NO. IS PALINDROME OR NOT.

import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println(" ENTER NO. : ");
int no=sc.nextInt();
int n=no;
int reverse=0;
int i=0;
while(n!=0)                                // FIND REVERSE OF NO.
{
int rem=n%10;
reverse =reverse*10+rem;
n=n/10;
i++;
}
if(reverse==no)                            // CHECK WHETHER REVERSE IS EQUAL TO NO.
{
System.out.println(" NO IS PALINDROME ");
}
else
{
System.out.println(" NO IS NOT PALINDROME ");
}
}
}