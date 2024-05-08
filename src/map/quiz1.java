package map;

import java.util.HashMap;

public class quiz1 {

	public static void main(String[] args) {
		
//		문자형 키, String형 value를 저장하는 맵 생성
		HashMap<Character, String> map = new HashMap<>();

//		데이터 추가 
		map.put('a', "사과");
		map.put('b', "바나나");
		map.put('c', "코코넛");
		
		System.out.println("key: b, value : " + map.get('b'));
		
		map.replace('b', "블루베리");
		System.out.println(map.get('b'));
		
		map.remove('a');
		System.out.println("hashmap : " + map);
		
//		특정 키값이 존재하는지 확인하기!
		if (map.containsKey('b')) {
			System.out.println("map에 b라는 키가 있습니다");
		} else {
			System.out.println("map에 b라는 키가 없습니다");
		}
	}
	

}
