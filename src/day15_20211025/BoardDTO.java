package day15_20211025;

public class BoardDTO {
	
	
	//필드생성
	private int bnumber;
	private String writer;
	private String title;
	private String contents;
	private String password;
	private int hits;
	//private int hits =0; 이라면
	
	//기본생성자
	BoardDTO(){
		
	}

	//매개변수
	public BoardDTO(int bnumber, String writer, String title, String contents, String password, int hits) {
		this.bnumber = bnumber;
		this.writer = writer;
		this.title = title;
		this.contents = contents;
		this.password = password;
		this.hits = hits;
		//hits가 0이라면 매개변수에서 제외하고 실행해도된다.
	}

	//get,set
	public int getBnumber() {
		return bnumber;
	}

	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	//toString
	@Override
	public String toString() {
		return "BoardDTO [bnumber=" + bnumber + ", writer=" + writer + ", title=" + title + ", contents=" + contents
				+ ", password=" + password + ", hits=" + hits + "]";
	}

}
