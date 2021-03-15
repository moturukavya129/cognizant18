package lab1;
import java.util.*;
public class sumofcubes{
	Scanner sc=new Scanner(System.in);
	public static int cubes(int num){
		int sum=0,n=0;
		while(num!=0){
			n=num%10;
			sum=sum+(n*n*n);
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int k=sc.nextInt();
		int result=cubes(k);
		System.out.println("sum of the cubes is :"+result);
	}
	
}

