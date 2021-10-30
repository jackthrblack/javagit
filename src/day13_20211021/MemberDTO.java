package day13_20211021;

public class MemberDTO {

	private String id;
	private String pw;
	private String name;
	private String email;
	private int meNum;

	MemberDTO() {

	}

	public MemberDTO(String id, String pw, String name, String email, int meNum) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.meNum = meNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMeNum() {
		return meNum;
	}

	public void setMeNum(int meNum) {
		this.meNum = meNum;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", meNum=" + meNum + "]";
	}
	
	
	
	
}