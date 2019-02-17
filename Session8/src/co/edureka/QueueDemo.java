package co.edureka;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=10;i>0;i--){
			queue.add(i);
		}
		
		// We added like this
		// (Head) 10 9 8 7 6 5 4 3 2 1 (Tail)
		
		// PQ sorts the data for us !!
		// This is how data shall be in real !!
		// (Head) 1 2 3 4 5 6 7 8 9 10 (Tail)
		
		/*
		//peek() returns the Head !! 
		System.out.println("Head of Queue is: "+queue.peek()); 		// 1
		queue.poll(); // poll removes the head !!
		System.out.println("Head of Queue now is: "+queue.peek()); 	// 2
		System.out.println("Size of Queue is: "+queue.size()); 		// 9
		*/
		
		for(int i=0;i<queue.size();i++){
			System.out.println(queue.peek()); // Printing Head
			queue.poll();					  // Removing Head -> size will change !!
		}
		
		// Output: 1 2 3 4 5 
	}

}
