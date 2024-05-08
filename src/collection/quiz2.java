package collection;

import java.util.ArrayList;

public class quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Book> list = new ArrayList<>();
		
		Book book1 = new Book(1,"리액트");
		Book book2 = new Book(2,"자바");
		Book book3 = new Book(3,"스프링");
		
		list.add(book1);
		list.add(book2);
		list.add(book3);
		
		for (int i=0;i<list.size();i++) {
			Book book = list.get(i);
			System.out.println(list.get(i));
		}
		
		list.clear(); // 리스트 삭제
		
		
	}

}

class Book {
	int bookNo;
	String title;
	
	public Book(int bookNo, String title) {
		super();
		this.bookNo = bookNo;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + "]";
	}
	
	
}