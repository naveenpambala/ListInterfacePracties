package com.queue;

import java.util.PriorityQueue;

public class QueuePrac {

	public static void main(String[] args) {
		 
		//Priority Queue--> out chesetappudu priorty ni base chesukoni
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		//Addition -offer,add
		pq.offer(200);
		pq.offer(300);
		pq.add(100);
		pq.add(800);
		pq.add(900);	 
		System.out.println(pq);//[100, 300, 200, 800, 900]
	

	 
		
		//retrieval -peek
		
//		System.out.println(pq.peek());//getting height priority numbber[that means smallest num of list] 100

		
		
		// Removal -poll,remove
//		System.out.println(pq.remove(100));
//		System.out.println(pq.poll());//remove 200,[300, 800, 900]
//	 	System.out.println(pq.poll());//remove 300 [800, 900]
	 
		
//	 	System.out.println(pq.contains(300));//false

	}

}
