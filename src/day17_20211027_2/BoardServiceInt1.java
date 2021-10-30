package day17_20211027_2;
//인터페이스의 구현클래스로 지정
public class BoardServiceInt1 implements BoardServiceInterface{

	
	//상속받는 추상메서드를 인터페이스를 구현한 클래스에서 실행블록을 정의할 수 있음.
	//@Override: 메서드 재저으이에 사용하는 어노테이션
	@Override // 상속받은 메서드에 붙이는 어노테이션(@이로 시작하는것)
	public void boardWrite(String val1, String val2) {
		System.out.println("BoardServiceInt1.boardWrite");
		
	}

}
