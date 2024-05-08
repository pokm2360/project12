package map;

import java.util.HashMap;

public class quiz5 {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		Member member4 = new Member(1004, "고길동");
		
		memberHashMap.addMember(member1);
		memberHashMap.addMember(member2);
		memberHashMap.addMember(member3);
		memberHashMap.addMember(member4);
		memberHashMap.showAllMember();
		
		System.out.println("MemberHasgMap에 1004번 회원이 있으면 삭제하세요!");
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}

}


class MemberHashMap {
	
//	맵 선언
	HashMap<Integer, Member> map;
	
//	맵 생성
	public MemberHashMap() {
		map = new HashMap<>();
	}
	
//	추가
	public void addMember(Member member) {
		map.put(member.memberId, member);
	}
	
//	삭제
	public boolean removeMember(int memberId) {
		
		if (map.containsKey(memberId)) { // 해당 아이디가 존재하는지 확인
			map.remove(memberId);
			System.out.println(memberId + "번 회원을 삭제하였습니다");
			return;
		}
		System.out.println(memberId + "번 회원이 존재하지 않습니다");
	}
	
//	출력
	public void showAllMember() {
		
		Collection<Member> values = map.values();
		
		for(Member member : values) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
	
}
