import java.util.*;
public class DequeExample
{
	public static void main(String[] args) 
	{
		Deque<String>deque=new ArrayDeque<String>();
		deque.offer("arvind");
		deque.offer("vimal");
		deque.offer("mukul");
		deque.add("jai");
		deque.offerLast("parvez");
		System.out.println("After offerfirst traversal.....");
			for(String s:deque)
			{
				System.out.println(s);
			}
		deque.pollFirst();
		System.out.println("After pollLast()traversal..");
			for(String s:deque)
			{
				System.out.println(s);
			}
	}
}