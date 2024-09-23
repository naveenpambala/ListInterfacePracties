package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListPrac {

	public static void main(String[] args) {
		 ArrayList<Integer> all = new ArrayList<>(200);
		 all.add(1);
		 all.add(10);
		 all.add(null);
		 all.add(1000);
		 all.add(100000);
		 all.add(null);
		 System.out.println(all);
		 
//		 Array To ArrayList
		 Integer[] arr = new Integer[] {1,5,8,9};
		 ArrayList<Integer> all2 = new ArrayList<>(Arrays.asList(arr));
		 
		 //Get values from list using GET
		 
		 System.out.println(all.size());
		 System.out.println(all.get(5));
		 
		 //deleting the elements frm list
		 
//		 all.remove(0);
//		 all.removeAll(all2);
//		 all.clear();
		 
		 //update of list elements
		 all.set(0, 25);
		 all.set(2, null);
		 
		System.out.println(all.contains(1));
		System.out.println(all.containsAll(all2)); 
		 System.out.println(all);
		 
		 System.out.println("For");
		 for(int i=0;i<all.size();i++) {
			 System.out.print(all.get(i));
		 }
		 System.out.println("ForEach");
		 for(Integer ints:all) {
			 System.out.println(ints);
		 }
		 
		Collections.synchronizedList(all);
		 

	}
	/*   ******important******
	 * default capacity ---0 (elements are not add to the list),(memory will save)
		* intial capacity --10(means before adding elements),(memory will save)
		* only 50% space ni matramey inctrease chesthadi(memory will save)
		* duplicates allow 
		* null allow
		* maintain insertion order
		* sorted order not maintain(values ni sort cheesi print cheyyadam) AND Insertion and Sorted Both are Quite Opposite
		* we access of elements randamly
		* ArrayList is not sychronized (that mean allow multiple threads,so some problem came thats why we are using explicitly add synchronization,its morperformance becasue of multiple working do) 
		* Used Sistuations--> elements adding or retriving
		*
	 * 
	 */
	

}
