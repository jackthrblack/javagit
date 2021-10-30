package day17_20211027_1;
//BoardDTO를 상속받는 클래스
public class BoardDTO_Free extends BoardDTO {
	private String boardPassword;

	BoardDTO_Free(){
		
	}
	
	public BoardDTO_Free(String boardPassword) {
		this.boardPassword = boardPassword;
	}

	
	
	
// 부모가 가진 필드를 함께 생성자 매개변수로 지정하는 자식클래스 생성자
	public BoardDTO_Free(int boardNumber, String boardWriter, String boardTitle, String boradContents,
			String boardPassword) {
		super(boardNumber, boardWriter, boardTitle, boradContents);
		System.out.println("BoardDTO_Free생성자 호출");
		// super()는 부모의 생성자를 호출하는 명령어.
		// super 사용시 매개변수는 부모클래스가 가지고 있는 생성자 형식과 맞아야 함.
		this.boardPassword = boardPassword;
		System.out.println("BoardDTO_Free생성자 호출끝");
	}

	public String getBoardPassword() {
		return boardPassword;
	}

	public void setBoardPassword(String boardPassword) {
		this.boardPassword = boardPassword;
	}
	
	
}
