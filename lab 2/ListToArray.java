import java.util.ArrayList;
public class ListToArray {

	public static void main(String[] args) {
			    ArrayList<Integer> list= new ArrayList<>();
			    list.add(1);
			    list.add(2);
			    list.add(3);
			    Integer [] arr = new Integer[list.size()];

			    list.toArray(arr);
			    System.out.print("Array: ");
			    for(int i=0;i<arr.length;i++) {
			      if(i==arr.length-1)
			      System.out.print(arr[i]);
			      else
				      System.out.print(arr[i]+",");
			    }

	}

}