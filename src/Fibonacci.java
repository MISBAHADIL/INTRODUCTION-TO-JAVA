
// GENERATE FIBONACCI SERIES


    import java.util.*;

    class Fibonacci
	{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println(" NO OF ELEMENTS IN SERIES : ");
			int n=sc.nextInt();
			int x=0;
			for(int i=0;i<n;i++)
			{
				x=x+i;
			System.out.println(x);
			}
		}
	}
			