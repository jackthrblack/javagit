package day17_20211027_1;

public class BoardDTO {

	private int boardNumber;
	private String boardWriter;
	private String boardTitle;
	private String boradContents;
	
	BoardDTO(){
		
	}

	public BoardDTO(int boardNumber, String boardWriter, String boardTitle, String boradContents) {
		System.out.println("BoardDTO 생성자 호출됨");
		this.boardNumber = boardNumber;
		this.boardWriter = boardWriter;
		this.boardTitle = boardTitle;
		this.boradContents = boradContents;
		System.out.println("BoardDTO 생성자 호출끝");
	}

	public int getBoardNumber() {
		return boardNumber;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	private void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoradContents() {
		return boradContents;
	}

	public void setBoradContents(String boradContents) {
		this.boradContents = boradContents;
	}

	@Override
	public String toString() {
		return "BoardDTO [boardNumber=" + boardNumber + ", boardWriter=" + boardWriter + ", boardTitle=" + boardTitle
				+ ", boradContents=" + boradContents + "]";
	}
	
	
}
