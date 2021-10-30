package day13_20211021;

import java.util.*;

public class Membermain {

	public static void main(String[] args) {
//mList는 MemberList에서 관리 주체
		// 메인에서 서비스한테 주고 서비스에서 입력받은 걸 가져와서 최종본은 메인클래스에서 저장.
		// 수정도 마찬가지
		Scanner in = new Scanner(System.in);
		List<MemberDTO> mList = new ArrayList<>();

		MemberService ts = new MemberService();

		boolean run = true;

		while (true) {

			int menu = in.nextInt();

			switch (menu) {

			case 1:
				mList = ts.memberJoin(mList);
				break;
			case 2:
				ts.memberListView(mList); // toString 잊지말자...
				run = false;
				break;
			case 3:
				ts.memberLogin(mList);
				break;
			case 4:
				ts.memberUpdate(mList);
				mList = ts.memberUpdate(mList);
					break;
			case 5:
				run=false;
				break;
				}
			}
		}

	}
