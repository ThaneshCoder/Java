package Collection_List_Interface;


import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Vector_CRUD {
	
		public static void main(String[] args) {

			Vector arr = new Vector();
			
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
			// Using For each and Iterator
			System.out.println(arr.lastIndexOf((Object)"monkey"));
			System.out.println(arr.indexOf((Object)"monkey"));

	////3.	How to Update value from collection
			arr.set(2,21);
			
	////4.	How to Delete value from collection
//					arr.remove(1);
//					arr.remove("monkey");					
			
			System.out.println(arr.capacity()); // works on Vector Only
			System.out.println(arr.firstElement()); // works on Vector Only
			System.out.println(arr.lastElement());   // works on Vector Only
			
			Collections.sort(arr); // works on List Only
			Collections.reverse(arr);  // works on List Only
			System.out.println(arr);
			arr.clear();
			System.out.println(arr.isEmpty());

			}
	}		