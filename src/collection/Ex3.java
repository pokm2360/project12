package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex3 {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("둘리");
		hashSet.add("또치");
		hashSet.add("도우너");
		hashSet.add("도우너");
		
//		리스트와 삭제 방법이 다름
		hashSet.remove("도우너");
		// 인덱스가 없어 get 사용 불가능
//		Set은 중복을 허용하지 않음
		
//		Iterator 객체 생성하여 set 순회
		Iterator<String> ir = hashSet.iterator()
;
		
		while(true) { //다음 요소가 있으면 while(ir.hasNext())
			  
			if(ir.hasNext() == true ) {
			String member = ir.next(); // 다음 요소를 가져옴
			System.out.println(member + " ");
			} else {
				break;
			}
			
//			일반포문 - index필요함
//			람다식 포문
//			값을 저장할 변수 : 자료구조
			for(String member : hashSet) {
				System.out.println(member + " ");
			}
		}

		
	
	}
}
