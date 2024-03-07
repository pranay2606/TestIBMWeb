package CollectionsPackage;
import java.util.*;
public class SetExample {
	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		TreeSet<String> tset = new TreeSet<String>();
		
		hset.add("abc");
		hset.add("def");
		hset.add("cde");
		hset.add("bcd");
		
		System.out.println("HashSet Values"+","+hset);
		
		lhset.add("abc");
		lhset.add("def");
		lhset.add("cde");
		lhset.add("bcd");
		System.out.println("LinkedHashSet Values"+","+lhset);
		
		tset.add("abc");
		tset.add("def");
		tset.add("cde");
		tset.add("bcd");
		System.out.println("TreeSet Values"+","+tset);
	}
}
