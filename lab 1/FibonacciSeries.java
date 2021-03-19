import java.util.*;
public class FibonacciSeries {
	public static StringBuilder fibonacciSequence(int n)
	{
		StringBuilder sb=new StringBuilder();
		int first=0,second=1,fib=0;
		for(int i=1;i<=n;i++)
		{
			if(n==1)
			{
				sb.append(Integer.toString(first));
				break;
			}
			else
			{
				if(i==1)
					fib=0;
				else if(i==2)
					fib=1;
				else
				{
				fib=first+second;
		        first=second;
				second=fib;
				}
				if(i!=n)
					sb.append(Integer.toString(fib)+" ");
				else
					sb.append(Integer.toString(fib));
			}
		}
		return sb;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the the number upto which the fibonacci sequence is created");
		int number=sc.nextInt();
		System.out.println(fibonacciSequence(number));
	}

}