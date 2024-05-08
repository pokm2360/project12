package collection;

import java.util.ArrayList;

public class quiz3 {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();

		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		Member member4 = new Member(1004, "고길동");
		
		
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		memberArrayList.addMember(member4);
		memberArrayList.showAllMember();

		memberArrayList.removeMember(1003);
		memberArrayList.showAllMember();
			
	}
	
}

class MemberArrayList {
	
	ArrayList <Member> list; // 리스트 선언
	
	public MemberArrayList() {
		list = new ArrayList<Member>(); // 리스트 생성!!
	}

	// 회원을 추가하는 메소드
	public void addMember(Member member) {
		list.add(member);
	}

	// 회원을 삭제하는 메소드
	public void removeMember(int memberId) {
		
		for (int i = 0; i < list.size(); i++) {
			
			Member member = list.get(i);
			int id = member.memberId;
			
			if (id == memberId) { // memberId가 맞다면
				list.remove(i);
				System.out.println(memberId + "번 회원을 삭제하였습니다");
			}
		}
		System.out.println(memberId + "번 회원은 없습니다");
		return;
	}

	// 회원을 출력하는 메소드
	public void showAllMember() {
		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}