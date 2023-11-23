package Collection_List_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Array_CRUD{ 

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();
		
////1.	How to Add value to collection
		arr.add("monkey");	
		arr.add("donkey");	
		arr.add(21);
		arr.add(null);
		arr.add(true);
		arr.add("monkey");
		arr.add(41.73);

////2.	How to Fetch value from collection
		System.out.println(arr);
		System.out.println(arr.get(3));
		
		for (Object a : arr) {
			System.out.println(a+" ");
		}
		
		Iterator it=arr.iterator();
		while (it.hasNext()) {
			Object a = it.next();
			System.out.print(a+" ");
		}
		
		System.out.println(arr.lastIndexOf((Object)"monkey"));
		System.out.println(arr.indexOf((Object)"monkey"));

////3.	How to Update value from collection
		arr.set(2,21);
		
////4.	How to Delete value from collection
//				arr.remove(1);
//				arr.remove("monkey");
		
		Collections.sort(arr); // works on List Only
		Collections.reverse(arr);  // works on List Only
		System.out.println(arr);
		arr.clear();
		System.out.println(arr.isEmpty());

		}
}		