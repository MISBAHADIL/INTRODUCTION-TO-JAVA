
//PROGRAM TO DISPLAY COMMON ELEMENTS IN 2 ARRAYS.

import java.util.Scanner;
class CommonElement
{
 public static void main(String... args)
 {
   Scanner sc=new Scanner(System.in);
   int arr1[]=new int[4];
   int arr2[]=new int[4];
   int arr3[]=new int[4];
   int n=arr1.length;
   int count=0;

     //INPUT FIRST ARRAY

   System.out.println("first array");
   for(int i=0;i<n;i++)
    {
      arr1[i]=sc.nextInt();
    }

     //INPUT SECOND ARRAY

   System.out.println("second array");
   for(int i=0;i<n;i++)
    {
      arr2[i]=sc.nextInt();
     }

    //COMPARE BOTH ARRAYS

    for(int i=0;i<n;i++)
   {
	   for(int j=0;j<n;j++)
        {
          if(arr1[i]==arr2[j])
           {
	          arr3[count]=arr1[i];
	          count++;
           }
            else
           {
	             continue;
           }
         }
   }
   
   //PRINT NEW ARRAY
      System.out.println("new array");
      for(int i=0;i<count;i++)
       {
           System.out.println(arr3[i]);
       }


}
}