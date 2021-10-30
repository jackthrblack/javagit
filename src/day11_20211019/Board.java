package day11_20211019;

public class Board {

	String title;
	String writer;
	String contens;
	int view=0;
	
	
	
	void boardWrite(String title, String writer, String contens) {
		this.title=title;
		this.writer=writer;
		this.contens=contens;
	}
	
	void boardView() {
		
		System.out.println("제목을 입력하세요: "+title);
		System.out.println("작성자를 입력하세요: "+writer);
		System.out.println("내용을 입력하세요: "+contens);
		view=view+1;
		System.out.println(view);
	}
	
	void boardUpdate(String titleUpdate, String contensUpdate) {
		
		this.title = titleUpdate;
		this.contens = contensUpdate;
//		System.out.println("제목을 입력하세요: "+this.title);
//		System.out.println("작성자를 입력하세요: "+this.writer);
//		System.out.println("내용을 입력하세요: "+this.contens);
//		System.out.println("조회수: "+this.view);
		
		//메서드 안에서 메서드 호출
		boardView(); //=>같은 클래스 안에서 호출한거라서 ~~~.객체가 아니라 개체만 쓰면 된다.
		
		
	}
	
	
}
