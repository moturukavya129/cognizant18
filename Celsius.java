/**
*Name : kavya 
*Description: converting temp from celsius to fahrenheit
*Date:3/12/2021
*/
import java.util.*;
class Celsius{
	public static void main(String[]args)
	{
		
		Scanner sc= new Scanner(System.in);
		double c=sc.nextDouble();
		if(c>=0)
		{
			double f=(c*1.8)+32;
		System.out.println(f);
		}
		else
			System.out.println("give positive value");
	}
}
