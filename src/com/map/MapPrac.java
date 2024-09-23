 package com.map;

import java.util.*;
import java.util.Map.Entry;

public class MapPrac {

	public static void main(String[] args) {

					//HashMap (hash mechanism
		//creating a Map
		
		Map<Integer,String> m= new TreeMap<>();
		
		//Addition of elements into the map
		m.put(104, "Spring");
		m.put(102, "python");
		m.put(101, "java");
		m.put(106, "Angular");
		m.put(103, "oops");
		
//		m.put(105, "SpringBoot");
	
		
		//Retrival of elements keys into the map
		Set<Integer> key=m.keySet();
		 for(Integer keys:key) {
			 System.out.println(keys);
			 
		 }
		 System.out.println();
		//Retrival of elements values into the map
		 Collection<String> value=m.values();
		 for(String values:value) {
			 System.out.println(values);
			 
		 }
		 System.out.println();
		//Retrival of values from the map based on key
		 System.out.println(m.get(106));
		 System.out.println(m.get(105));
		 
		 System.out.println();
		//Retrival of keys-values   into the map
		 for(Integer keys:key) {
			 System.out.println(keys+"======>"+m.get(keys));
			 
		 }
		
		System.out.println(m);
		
		//Deleting the element from map
		m.remove(102);
		m.remove(101,"java");
		
		System.out.println(m);
		
		//verifications of keys and Values from map
		System.out.println(m.containsKey(101));	
		System.out.println(m.containsValue("Angular"));	
		
		//Updation of elements from Map( Methods)
		System.out.println(m);
		m.put(106, "React");//Re- insert
		m.replace(105, "Hibernate");		  
		m.putIfAbsent(105, "Corejava");
		System.out.println(m);
//		m.clear();
//		System.out.println(m);
		
		
		//without using setKey and Retriving Keys-elements
		Set<Entry<Integer,String>> entry = m.entrySet();
		for (Entry<Integer, String> entry2 : entry) {
			 Integer keyss = entry2.getKey();
			 String values =entry2.getValue();
			 System.out.println(keyss+">>>>>>"+values);
			
		}
		
		
	}
	
	

}
