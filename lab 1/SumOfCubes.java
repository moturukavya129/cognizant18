import java.util.*;
public class SumOfCubes {
	Scanner sc=new Scanner(System.in);
	public static int cubeSum(int n)
	{
	  int remainder=0,sum=0;
	  while(n>0)
	  {
		  remainder=n%10;
		  sum+=remainder*remainder*remainder;
		  n/=10;
	  }
	  return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int result=cubeSum(number);
		System.out.println(result);
	}

}