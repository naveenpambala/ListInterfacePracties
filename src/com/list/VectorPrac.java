package com.list;

import java.util.Arrays;
import java.util.Vector;

public class VectorPrac {

	public static void main(String[] args) {
		// internally create size is 10,when we can add more than 10 element size will
		// increase 20,30,40,etc etc....
		// size - no of elements prsent in list
		// capactiy - ArrayCapacity(10,20,30 etc etc..)
		Vector<String> v1 = new Vector<String>();

		v1.add("Tiger");
		v1.add("Lion");
		v1.add("Dog");
		v1.add("Elephant");
//	 		 v1.add(0,"opps"); specific index daggara add cheyyali anukuntey	 

		Vector<String> v2 = new Vector<String>();
		v2.add("java");
		v2.add("spring"); 

		 //	v1.addAll(v1); v2 adding into v1 last index
		v2.addAll(0, v1); // v2 adding first index
		
		// Check size and capacity
		
//		System.out.println(v2);
//		System.out.println("Size is: " + v1.size());
//		System.out.println("Default capacity is: " + v1.capacity());

		//Retriving the elements from the vector BY USING GET
//		System.out.println(v1.get(0));
		
		
		//Deleting the Elements From List
//		System.out.println(v1.remove(0));
//		System.out.println(v2.remove(v1));
//		System.out.println(v1.removeAll(v2));
		v1.clear();// clear the Entire list items
//		System.out.println(v1);
		
		
		//Verifictation of elements
//		System.out.println(v1.contains(v2));
//		System.out.println(v2.containsAll(v1));
		
		
		//Update the List of Items By USING SET
		v1.add("python");
		v1.set(0,"Jave");


//		System.out.println(v1.get(0));
		
		//you want know Index of purticuar element
		
//		System.out.println(v2.indexOf("java"));
//		System.out.println(v2.firstElement());
//		System.out.println(v2.lastElement());
		
		//ArrayList Convert to Array
		
		Object[] arr = v2.toArray();
		System.out.println(Arrays.toString(arr));
		
		Vector<Integer> v3 = new Vector<>();
		v3.add(2);
		v3.add(null);
		v3.add(null);
		v3.add(2);
		System.out.print(v3);//[2, null, null, 2]
		
		
		/*   **********Important ********
		* default capacity ---10(means before adding elements)
		* intial capacity --10(after adding one elemets ,entha capacity tho add avuthundi ani)
		* increase space 100%(like 10,20,30...)
		* duplicates allow 
		* null allow
		* maintain insertion order
		* sorted order not maintain(values ni sort cheesi print cheyyadam) AND Insertion and Sorted Both are Quite Opposite
		* we access of elements randamly
		* vector is sychronized (that means is wont allow multiple threads,allow one by one thats why synchronized) 
		* Used Sistuations--> Multithreading(working with multiple threads) and data is inceased exponentially
		*
		*/
	}

}
