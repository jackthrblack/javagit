package day10_20211018;

public class Member {

	String id;
	String pw;
	String name;
	String email;
	
	
	Member(String id, String pw, String name,String email){
	}
	
	void MemberJoin(String id, String pw, String name,String email){
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.email=email;
		System.out.println("가입완료");
	}
	
	
	boolean login(String id2, String pw2) {
		if(id.equals(id2) && pw.equals(pw2)) {
			return true;	
		}else {
			return false;
		}
	}
	
	void myInfo() {
		System.out.println("아이디: "+ id); 
		System.out.println("비밀번호: "+ pw); 
		System.out.println("이름: "+ name); 
		System.out.println("email: "+ email); 
	}//리턴값을 되돌려주니느것도 정보를 변경하는게 아니니 void를 쓴다.
	
	void memberUpdate(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + "]";
	}

	
	//필드가 가지고있는 값 다 출력하는법
		// 커서 오른쪽 마우스 -> Sourse ->
		//->Generate toSring~ -> Generate
	
	
	
	}