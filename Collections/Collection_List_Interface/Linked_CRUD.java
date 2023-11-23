package Collection_List_Interface;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class Linked_CRUD {
	
		public static void main(String[] args) {

			LinkedList arr = new LinkedList();
			
	////1.	How to Add value to collection
			arr.add("monkey");	
			arr.add(null);
			arr.add(true);
			arr.add("monkey");
			arr.add(41.73);
			arr.addLast("donkey");	
			arr.addFirst(21);

	////2.	How to Fetch value from collection
			System.out.println(arr);
			System.out.println(arr.get(3));
			// Using For each and Iterator
			System.out.println(arr.lastIndexOf((Object)"monkey"));
			System.out.println(arr.indexOf((Object)"monkey"));
//			getFirst()
//			getLast()
//			peek()
//			peekFirst()
//			peekLast()

	////3.	How to Update value from collection
			arr.set(2,21);
//			poll()
//			pollFirst()
//			pollLast()
			
	////4.	How to Delete value from collection
//					arr.remove(1);
//					arr.remove("monkey");	
//			pop()	
//			removeFirst()
//			removeLast()
			
			Collections.sort(arr); // works on List Only
			Collections.reverse(arr);  // works on List Only
			System.out.println(arr);
			arr.clear();	
			System.out.println(arr.isEmpty());
			}
	}		