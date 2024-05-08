package collection;

import java.util.HashSet;
import java.util.Iterator;

public class quiz4 {

	public static void main(String[] args) {
		
		HashSet<Integer> hashSet = new HashSet<>();
		
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		
		System.out.println(hashSet.size());

		Iterator<Integer> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			int member = ir.next();
			System.out.println(member + " ");
			} 
		for (int member : hashSet) {
			System.out.println(member + " ");
		}
		}
	
	}


