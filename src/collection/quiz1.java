package collection;

import java.util.ArrayList;

public class quiz1 {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<>();

		list.add('A');
		list.add('B');
		list.add('C');
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		list.remove(1);
		
		System.out.println("리스트 크기: " + list.size());
		
		for (int i=0;i<list.size();i++) {
			Character character = list.get(i);
			if (character=='A') {
				list.remove(i);
			}
			System.out.println(list.get(i));
		}
	}

}
