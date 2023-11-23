package Collection_List_Interface;

import java.util.ArrayList;

public class Array_List_Class{ 
	
//	1.Allow duplicate 
//	2.Follow order of insertion
//	3 Allows null
//	4.Index based 
//	5.Heterogenous and Homogenous
//	6.We can use Iterator
//	7.Initial Capacity 10 by default
//	8.Increasing Capacity 50%
//	9.Asynchronous
//	10.Fill ratio 1

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		
		arr.add("monkey");	
		arr.add("monkey");
		arr.add("Tree");
		arr.add("Mountain");
		arr.add(21);
		arr.add(1,true);
		arr.add(41.73);
		arr.add(null);
	
		System.out.println(arr);
		System.out.println(arr.set(1,"Tree"));
		System.out.println(arr.get(1));
		}
}		