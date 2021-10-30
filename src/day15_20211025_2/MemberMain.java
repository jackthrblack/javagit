package day15_20211025_2;

import java.util.*;

public class MemberMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		// MemberDTO를 저장할 Map 선언
		Map<Integer, MemberDTO> mMap = new HashMap<>();
		// 회원 번호를 키값으로 사용할거니 떼문에 integer를 사용
		boolean run = true;
		
		MemberService ma =new MemberService();
		
		while(run) {
			System.out.println("1.회원가입||2.로그인||3.전체조회||4.정보수정||5.종료");
			System.out.print("메뉴선택>");
			int menu = in.nextInt();
			
			if(menu==1) {
				mMap=ma.memberJoin(mMap);
			}else if(menu==2) {
				mMap=ma.login(mMap);
			}else if(menu==3) {
				ma.memberListView(mMap);
			}else if(menu==4) {
				mMap=ma.emailUPdate(mMap);
			}else if(menu==5) {
				run=false;
			}
		}

	}

}
