package day17_20211027_1;

public class BoardMain {

	public static void main(String[] args) {
		// BoardDTO 객체 생성
		
		BoardDTO b1 = new BoardDTO();
		b1.setBoardNumber(0);
		//b1.setBoardTitle("작성자1");
		BoardDTO b2 = new BoardDTO(2,"작성자2","제목2","내용2");
		System.out.println(b2);
		
		// BoardDTO_Free 객체 생성
		BoardDTO_Free bf1 = new BoardDTO_Free();
		
		//부모클래스(BoardDTO)가 가지고 있는 setBoardTitle 메서드를
		// 사용할 수 있음.(상속을 받았기 때문에)
		bf1.setBoardTitle("자유제목1");
		bf1.setBoradContents("하하하");
		
		
		BoardDTO_Free bf2 = new BoardDTO_Free(4,"자유작성자3","자유제목2","자유내용2","비번2");
	}

}
