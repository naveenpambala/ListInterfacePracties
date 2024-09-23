package com.set;

import java.util.HashSet;
import java.util.TreeSet;

public class SetPrac {

	public static void main(String[] args) {
		// Hashset ->HapshMap=> Array f nodes(Key,value)[Internal implementation]
//		Set<Integer> hs = new HashSet<>();
//		new Object();//dummy object
		//insertion order ni fallow avvadu
		HashSet<Integer> hs= new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		hs.add(85);
		
		 //remove
		 hs.remove(85);
		 System.out.println(hs);
		 //contains
		 System.out.println(hs.contains(85));
		 //updation
//		 No updateion in case you update ,remove the element then add
		
		 //retrival elements from set		 
		 for (Integer integer : hs) {
			 System.out.println(integer);
			
		}
		 System.out.println(hs);
		 
		 /*
		  * LinkedHashSet -> LikedHashMap[internal implementation]-->Link of nodes(key,value)
		  * insertion order ni fallow avvuddi
		  * hs.isEmpty, hs.size()
		  * 
		  * ======Treeset=========
		  * Treeset-> TreeMap-->binary tree[internal Implemntation]
		  * sorted order->Assending order
		  * 
		  *  System.out.println(hs);
		  * 
		  * 
		  * 
		  */
		 TreeSet<Integer> ts= new TreeSet<>();
			ts.add(10);
			ts.add(20);
			ts.add(30);
			ts.add(40);
			ts.add(50);
			ts.add(60);
			ts.add(85);
			System.out.println(ts);
			System.out.println(ts.first());
			System.out.println(ts.last());
			System.out.println(ts.pollFirst());//remove small element
			System.out.println(ts.pollLast());//remove big element
		 
		 
	}

}
