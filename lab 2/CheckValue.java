import java.util.Scanner;

public class CheckValue {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);


		System.out.print("Enter the number of items:");
		final int NUM_ITEMS=sc.nextInt();


		System.out.print("Enter the elements of array(seperated by space):");
		int [] arr=new int[NUM_ITEMS];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();


	  System.out.print("Enter the value to be checked:");
      int valueToCheck=sc.nextInt();


      boolean status = false;
      for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i]==valueToCheck)
    	  {
    		  status=true;
    		  break;
    	  }
      }
      if(status==true)
    	  System.out.printf("yes the value %d is present in array",valueToCheck);
      else
    	  System.out.printf("No  the value %d is not present in array",valueToCheck); 
	}

}