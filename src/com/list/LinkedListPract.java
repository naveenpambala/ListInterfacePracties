package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPract {

	public static void main(String[] args) {
		//adding Arraylist object to LinkedList		
		ArrayList<String> al = new ArrayList<>();
		al.add("s1");
		al.add("s2");
		
		
		//Linked list create only two  ways
		LinkedList<String> ll = new LinkedList<>();
		ll.add("y1");
		ll.add("y2");
		ll.add("y3");
		ll.add(1,"YY");
		ll.add(null);
		ll.add("y1");

		ll.addAll(al);
		
		//remove elements from list
		
//		ll.clear();
//		ll.remove();
		
		//searching elements from list
		
//		ll.contains("y1");
//		ll.containsAll(al);
		
		//update elements from list
		ll.set(0, null);
		
		System.out.println(ll.get(7));
		System.out.println(ll.get(0));
		System.out.println(ll);
		
		//not synchronized so 
		Collections.synchronizedCollection(ll);
		
		/*   ******important******
		    * default capacity ---0 (elements are not add to the list),(memory will save)
		    * intial capacity --10
		    *when we add the element node will create 			 
		    * only 50% space ni matramey inctrease chesthadi(memory will save)
			* duplicates allow 
			* null allow
			* maintain insertion order
			* sorted order not maintain(values ni sort cheesi print cheyyadam) AND Insertion and Sorted Both are Quite Opposite
			* we access of elements randamly
			* LinkedList is sychronized when we use collections class, out of the box we can provide synchronize
			*By default not sychronized (that mean allow multiple threads,so some problem came thats why we are using explicitly add synchronization,its morperformance becasue of multiple working do) 
			* Used Sistuations-->  data manipulation( updation purpose)
			*Linked list are 2 types
			*1) Single(next)
			*2) double LinkedList(next, previous)[in java we are using double linkedList]
		 * 
		 */
		 
	}

}
