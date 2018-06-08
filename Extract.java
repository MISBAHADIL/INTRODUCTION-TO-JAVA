
//  PROGRAM TO EXTRACT DIGITS FROM A STRING.

import java.util.*;
class Extract
{
    public static void main(String... args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter string");
    String st=sc.nextLine();
    for(int i=0;i<=st.length();i++)
  {   
    
    st=st.replaceAll("[^0-9]","");
  }
    System.out.println(st);
}
}
