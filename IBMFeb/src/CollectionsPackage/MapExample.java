package CollectionsPackage;
import java.util.*;
import java.util.Map.Entry;
public class MapExample {
	public static void main(String[] args) {
		HashMap<Integer,String> hmap = new HashMap<Integer, String>();
		
		hmap.put(101, "abcd");
		hmap.put(102, "bcde");
		hmap.put(103, "cdef");
		System.out.println(hmap);
		hmap.put(102, "defg");
		System.out.println(hmap);
		
		for(Map.Entry<Integer,String> e : hmap.entrySet()) {
			System.out.println(e.getKey()+","+e.getValue());
		}
	}
}
