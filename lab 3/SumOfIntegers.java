import java.util.Scanner;
import java.util.StringTokenizer;
public class SumOfIntegers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.next();
		StringTokenizer st=new StringTokenizer(str,",");
		int sum=0;
		while(st.hasMoreTokens())
		{
			sum+=Integer.parseInt(st.nextToken());
		}
		System.out.println("The sum of integers:"+sum);		
	}

}