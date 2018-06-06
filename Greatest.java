//PROGRAM TO FIND OUT GREATEST ELEMENT IN AN ARRAY.


    import java.util.Scanner;
    class Greatest
     {
       public static void main(String args[])
       {
          Scanner sc=new Scanner(System.in);
          int d[]={1,4,0,2,8,7};
          int n=d.length;
          int greatest=d[0];
          for(int i=0;i<n;i++)
            {
              if(d[i]>greatest)
                {
                  greatest=d[i];
                }
            }

        System.out.println("greatest element is "+ greatest);

       }
     }