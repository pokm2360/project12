package map;

import java.util.HashMap;

public class quiz2 {

	public static void main(String[] args) {
		
//		문자형 키, int형 value를 저장하는 맵 생성
		HashMap<String, Integer> map = new HashMap<>();

//		데이터 추가 
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 100);
		
		//점수 수정
		map.replace("국어", 50);
		map.replace("수학", 60);
		map.replace("영어", 70);
		
		//영어점수 삭제
		map.remove("영어");
		
		//저장된 요소를 하나씩 출력
		System.out.println(map.get("국어"));
		System.out.println(map.get("수학"));
		
		
		
		//저장된 요소를 한번에 출력
		System.out.println(map.values());
		
		
		
		
	}
	

}
