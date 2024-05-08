package collection;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
//		Member member3 = new Member(1003, "도우너");

		
		list.add(member1);
		list.add(member2);
		list.add(new Member(1003, "도우너"));
//		list.add(member3);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
//		System.out.println(list.get(3));
		
		list.remove(0);
		
		System.out.println("전체 회원 수: " + list.size());
		
//		리스트 출력
		System.out.println(list);
		
//		for문을 이용해서 전체 회원정보 출력
		for(int i=0;i<list.size();i++) {
			Member member = list.get(i);
			System.out.println(member.toString());
		}
	}

}

//쇼핑몰 회원
class Member {
	int memberId;
	String memberName;
	
	public Member(int memberId, String memberNmae) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
	
}