package generic;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		
		//숫자를 저장하는 리스트 생성
		ArrayList<Integer> list1 = new ArrayList<>(); //리스트의 자료형
		list1.add(10); //int 타입의 값만 저장 가능
		Integer i = list1.get(0); // 값을 꺼낼 때 형변환 할 필요없음
		System.out.println(i);
		
//		문자열을 사용하는 리스트 생성
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Aaa"); //str 타입의 값만 저장 가능
		String str = list2.get(0);
		System.out.println(str);
	}

}
