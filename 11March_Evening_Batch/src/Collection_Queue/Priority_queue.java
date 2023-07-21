package Collection_Queue;

import java.util.PriorityQueue;

public class Priority_queue {

	public static void main(String[] args) {
		//Queue uses FIFO order
		//insertion order is not preserved
		//duplicates are allowed.
		//Homogenous type of data is saved
		
		//Queue uses head and tail concept
		PriorityQueue PQ = new PriorityQueue();
		PriorityQueue PQ1 = new PriorityQueue();
		
		PQ.add('A');
		PQ.add('Z');
		PQ.add('B');
	
		System.out.println(PQ.add('A'));
		System.out.println(PQ);
		
		
		//1. add() or offer()
		//when we try to add duplicate element using add menthod it will throw exception 
		//but the same with offer method will return false at console
		
		PQ.offer('A');
		System.out.println(PQ);

		//2. Element() or Peek()
		//using element() we get head element but queue is empty it will throw excepiton
		//where in using  peek() we get head element but queue is empty it will not throw excepiton, returns null at console
		
		System.out.println(PQ.element());
		//System.out.println(PQ1.element());.NoSuchElementException as queue is empty

		System.out.println(PQ.peek());
		System.out.println(PQ1.peek());//returns null as queue is empty
		
		//3. Remove() or poll()
		//using remove() head element is removed and throws exception if queue is empty
		//where in using poll() head element is removed but if empty retuns null
		
		System.out.println(PQ.remove());
	//	System.out.println(PQ1.remove()); NoSuchElementException as queue is empty
		
		System.out.println(PQ.poll());
		System.out.println(PQ1.poll());
		
		//reading element from priority queue we can not use simple for loop as insertion order is not preserved.
		
		for(Object obj : PQ) {
			System.out.println(obj);
		}

	}

}
