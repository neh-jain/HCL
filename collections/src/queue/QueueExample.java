package queue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<5;i++)
		{
			q.add(i);
		}
		System.out.println("Elements of queue "+q);
		int re = q.remove();
		System.out.println("Removed Element "+re);
		System.out.println("Elements of queue "+q);
		System.out.println("Head of queue "+q.peek());
		System.out.println("Head of queue "+q.size());
		
		Queue<String> pq = new PriorityQueue<>();
		pq.add("me");
		pq.add("for");
		pq.add("Geeks");	
		System.out.println(pq);
		
		Iterator i = pq.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}