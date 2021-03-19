import java.util.Arrays;
import java.util.Scanner;

public class OrderOfAlphabets{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of string array");
		final int NUM_ITEMS=sc.nextInt();
		int rangeOfCases=0;
		String [] items=new String[NUM_ITEMS];
		System.out.println("Enter the value of items of string array");
		for(int i=0;i<items.length;i++)
			items[i]=sc.next();
		System.out.println(sortStrings(NUM_ITEMS, items));


	}

	private static String sortStrings(final int pNUM_ITEMS, String[] str) {
		int rangeOfCases;
		String output="";
		for(int i=0;i<str.length-1;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].compareToIgnoreCase(str[j])>0)
				{
				String temp=str[i];
				str[i]=str[j];
				str[j]=temp;
				}
		    }
		}
		if(pNUM_ITEMS%2==0)
			rangeOfCases=pNUM_ITEMS/2;
		else
			rangeOfCases=pNUM_ITEMS/2+1;
		for(int i=0;i<rangeOfCases;i++)
		{
				output+=str[i].toUpperCase()+" ";
		}
		for(int i=rangeOfCases;i<pNUM_ITEMS;i++)
		{
			if(i!=pNUM_ITEMS-1)
				output+=str[i].toLowerCase()+" ";
				else
					output+=str[i].toLowerCase();
		}
		return output;
	}

}