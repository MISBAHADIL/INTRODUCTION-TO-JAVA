// PROGRAM TO SORT ELEMENTS IN AN ARRAY.


  import java.util.Scanner;
  class Sort
 {
   public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int d[]=new int[5];
     int n=d.length;
     int temp=0;
     System.out.println("enter array");             //ENTER ARRAY
     for(int i=0;i<n;i++)
     {
       d[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++)
     {
         for(int j=i+1;j<n;j++)
           {
             if(d[i]>d[j])                          
               {                                    //SWAPPING AND SORTING
                   temp=d[i];
                   d[i]=d[j];
                   d[j]=temp;
               }
           }
     }
    for(int i=0;i<n;i++)                            // PRINT SORTED ARRAY
     {
          System.out.println("ascending order"+d[i]);
     }
   }
   }
