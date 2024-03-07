package CollectionsPackage;
import java.util.*;
public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Object> link1 = new LinkedList<Object>();
		ArrayList<Object> alist = new ArrayList<Object>();
		alist.add(100);
		alist.add("welcome");
		alist.add(11.3);
		
		link1.add("Java");
		link1.add(100);
		link1.add(10.4);
		System.out.println(link1);
		link1.add(2, "list");
		System.out.println(link1);
		//link1.addAll(alist);
		link1.addAll(1, alist);
		System.out.println(link1);
		link1.addLast(120);
		link1.addFirst(130);
		System.out.println(link1);
		link1.remove("welcome");
		System.out.println(link1);
		link1.removeFirst();
		System.out.println(link1);
		link1.removeLastOccurrence(100);
		System.out.println(link1);
		System.out.println(link1.size());
		//Collections.sort(link1);
		//link1.clear();
		System.out.println(link1);
		
		
	}
}
