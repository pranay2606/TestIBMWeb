package CollectionsPackage;
import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>(); 
		ArrayList<String> alist1 = new ArrayList<String>(); 
		ArrayList<Object> alist2 = new ArrayList<Object>(); 
		
		alist.add(100);
		alist1.add("Hello");
		alist2.add(100);
		alist2.add("welcome");
		alist2.add(10.4);
		
		alist.add(200);
		alist.add(250);
		System.out.println(alist);
		//alist.add(1, 340);
		//alist.remove(2);
		alist.set(2, 300);
		//System.out.println(alist.get(1));
		System.out.println(alist);
		
		
		Iterator itr = alist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}
}
