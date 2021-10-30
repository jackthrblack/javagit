package day17_20211027_2;

public class BoardMain {

	public static void main(String[] args) {
	
	//BoardService1을 사용하는 경우
	BoardService1 bs1 = new BoardService1();
	bs1.boardWrite();
	//BoardServicd2를 사용하는 경우
	BoardService2 bs2 = new BoardService2();
	bs2.boardWrite();
	
	// 인퍼에이스 활용
	// 인터페이스는 생성자가 없음
	// 우변에는 인터페이스의 구현클래스 생성자를 사용함
	//BoardServiceInterface bs = new BoardServiceInterface(); (x)
	
	BoardServiceInterface bs = new BoardServiceInt1();
	bs.boardWrite("aa","bb");
	}

}
