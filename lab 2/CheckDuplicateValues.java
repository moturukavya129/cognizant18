import java.util.Scanner;

public class CheckDuplicateValues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);


		System.out.print("Enter the number of items:");
		final int NUM_ITEMS=sc.nextInt();


		System.out.print("Enter the elements of array(seperated by space)");
		int [] arr=new int[NUM_ITEMS];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();


		int count=0;
		String output="";
		System.out.println("Duplicate elements in the given array");
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					break;
				}
			}
				if(count==1)
				{
					if(output.contains(Integer.toString(arr[i]))==false)
						output+=Integer.toString(arr[i])+",";

				}

		}
		System.out.println(output.substring(0,output.length()-1));
	}

}