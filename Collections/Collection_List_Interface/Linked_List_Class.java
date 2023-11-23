package Collection_List_Interface;

import java.util.LinkedList;

public class Linked_List_Class { 
	
//	1.Allow duplicate 
//	2.Follow order of insertion
//	3 Allows null
//	4.Index based (Stored on Nodes) ****
	// it also has property of Queue interface
//	5.Heterogenous and Homogenous
//	6.We can use Iterator
//	7.Initial Capacity 10 by default
//	8.Increasing Capacity 50%
//	9.Asynchronous
//	10.Fill ratio 1

	public static void main(String[] args) {
		
		LinkedList arr = new LinkedList();
		
		arr.add("monkey");	
		arr.add("monkey");
		arr.add("Tree");
		arr.add("Mountain");
		arr.add(21);
		arr.add(1,true);
		arr.add(41.73);
		arr.add(null);
	
		System.out.println(arr.pop());	
		System.out.println(arr);
		System.out.println(arr.get(1));
		

//************************Below Methods Belongs to Queue Interface***********************************
		arr.add("tree");						//		add()	
		
		System.out.println(arr.peek());			//		peek()	

		System.out.println(arr.element());		//		element()	
		
		System.out.println(arr.poll());			//		poll()			

		System.out.println(arr.remove());				//		remove()	

		System.out.println(arr);
		
		//************************Below Methods Belongs to Linked list***********************************
//		arr.addFirst("yo");						//		addFirst()	
//		arr.addLast("oh");						//		addLast()		
//	
//		System.out.println(arr.getFirst());		//		getFirst()	
//		System.out.println(arr.getLast());		//		getLast()	
//
//		System.out.println(arr.peekFirst());	//		peekFirst()	
//		System.out.println(arr.peekLast());		//		peekLast()	
//
//		System.out.println(arr.pollFirst());	//		pollFirst()
//		System.out.println(arr.pollLast());		//		pollLast()
//
//		System.out.println(arr.pop());				//		pop()
//	
//		System.out.println(arr.removeFirst());		//		removeFirst()	
//		System.out.println(arr.removeLast());		//		removeLast()
//		
//		System.out.println(arr);
		}
}		