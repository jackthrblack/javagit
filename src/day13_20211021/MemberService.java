package day13_20211021;

import java.util.*;

public class MemberService {

	Scanner in = new Scanner(System.in);

	// 리턴이 있는건 값이 추가가 되거나 변경됐을때.
	// 리턴이 List<>인 이유는 이 리스트를 받아와서 다시 이 리스트를 줘야하기 때문이다.
	List<MemberDTO> memberJoin(List<MemberDTO> mList) {

		System.out.print("id입력: ");
		String id = in.nextLine();
		System.out.print("pw입력: ");
		String pw = in.nextLine();
		System.out.print("이름입력: ");
		String name = in.nextLine();
		System.out.print("email입력: ");
		String email = in.nextLine();
		int number = mList.size() + 1;
//		int meNum=1; //회원번호 이게 맞을까...?
//		for(int i =0; i<mList.size(); i++) {
//			mList.get(i).setMeNum(meNum++);
//		}
		// meNum
		MemberDTO mem = new MemberDTO(id, pw, name, email, number);
		mList.add(mem);

		return mList;
	}

	void memberListView(List<MemberDTO> mList) {

		// foreach를 쓰면 편하다.
		for (MemberDTO m : mList) {
			System.out.println(m);
		}
		for (int i = 0; i < mList.size(); i++) {
			System.out.println(mList.get(i).toString());

		}
	}

// 있는 값을 확인하는거 때문에 리턴은 없다.
	void memberLogin(List<MemberDTO> mList) {
//		System.out.print("id: ");
//		String id2 = in.nextLine();
//		System.out.print("pw: ");
//		String pw2 = in.nextLine();
//		for (int i = 0; i < mList.size(); i++) {
//			if (id2.equals(mList.get(i).getId()) && pw2.equals(mList.get(i).getPw())) {
//				System.out.println(id2 + "님 환영합니다.");
//			} else {
//				System.out.println("아이디 또는 비빌번호가 틀립니다.");
//			}
//		}
//
//		boolean login = false; // 아이디 비밀번호 확인용.
//		int b = 0; // ~~~님 환영합니다에서 누구인지를 출력하기 위해서.
//		for (int i = 0; i < mList.size(); i++) {
//			if (mList.get(i).getId().equals(id2) && mList.get(i).getPw().equals(pw2)) {
//				login = true;
//				b = i;
//			} // get을 사용할때는 꼭 괄호가 필요하다....
//		}
//		if (login) {
//			System.out.println(mList.get(b).getName() + "님 환영합니다.");
//		} else {
//			System.out.println("id 또는 pw 다시 입력해주세요.");
//		}
		// if를 나눠서 사용하는 이유는 첫 번째 if에서 할 시 계속해서 반복문이 돌기때문에
		// id, pw가 틀려도 환영합니다가 나오거나else 다시입력해주세요,환영합니다 이렇게 나온다.
		
		
		int result = loginCheck(mList); //로그인체크 호출
		//result가 -1이면 로그인 실패, 0이상의 값을 가지고 있으면 로그인성공으로 판단
		//로그인성공이라면 로그인한 회원의 인덱스번호를 가지고 있는 것.
		if(result>=0) {
			System.out.println("로그인 성공");
			System.out.println(mList.get(result).getId()+"님 환영합니다.");
			System.out.println("변경 이메일: ");
			String email = in.nextLine();
			//로그인한 회원 객체의 email 필드값을 수정하는 것.
			mList.get(result).setEmail(email);
		}else {
			System.out.println("로그인 실패");
		}
	}
//리턴 => List<MemberDTO>

	List<MemberDTO> memberUpdate(List<MemberDTO> mList) {
		System.out.print("id: ");
		String id2 = in.nextLine();
		System.out.print("pw: ");
		String pw2 = in.nextLine();
		for (int i = 0; i < mList.size(); i++) {
			if (id2.equals(mList.get(i).getId()) && pw2.equals(mList.get(i).getPw())) {
				System.out.println("변경할 이메일: ");
				String email = in.nextLine();
				mList.get(i).setEmail(email);
			} else {
				System.out.println("아이디 또는 비빌번호가 틀립니다.");
			}
		}
		return mList;
	}

//	void memberUpdate(List<MemberDTO> mList) {
//		System.out.print("id: ");
//		String id2 = in.nextLine();
//		System.out.print("pw: ");
//		String pw2 = in.nextLine();
//		boolean emailUp = false;
//		int a = 0;
//		for (int i = 0; i < mList.size(); i++) {
//			if (mList.get(i).getId().equals(id2) && mList.get(i).getPw().equals(pw2)) {
//				emailUp=true;
//				a=i;
//			}
//			if(emailUp) {
//				System.out.print("변경 email: ");
//				String email2 = in.nextLine();
//				mList.get(a).setEmail(email2);
//				System.out.println(mList.get(a).getEmail());
//			}
//
//		}
//		
//	}
	
	
	// 아이디, 비밀번호 확인을 위한 메서드
	//memberLogin, memberUpadate에서 호출해서 활용
	// 아이디, 비밀번호 일치하는 회원의 인덱스 번호를 리턴하고
	// 아이디, 비밀번호가 일하지 않으면 -1을 리턴.
	int loginCheck(List<MemberDTO> memberList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = scan.nextLine();
		System.out.print("비밀번호 : ");
		String password = scan.nextLine();
		int number = -1; // 로그인한 회원의 인덱스 번호를 가져가기 위한 번호 //배열을 쓰기 때문에 -1으로 함.
		for (int i = 0; i < memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId()) && password.equals(memberList.get(i).getPw())) {
				number = i;
			}
		}
		return number;
	}
	
	
}
