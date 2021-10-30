package day15_20211025_2;

import java.util.*;

public class MemberService {
	
	Scanner in = new Scanner(System.in);
	
	public Map<Integer, MemberDTO> memberJoin(Map<Integer, MemberDTO> mMap){
		System.out.print("id입력:");
		String id = in.next();
		System.out.print("pw입력: ");
		String pw = in.next();
		System.out.print("이름입력: ");
		String name = in.next();
		System.out.print("email입력: ");
		String email = in.next();
		int number = mMap.size() + 1;
		
		MemberDTO mem = new MemberDTO(id, pw, name, email, number);
		mMap.put(number,mem); // key가 과연 이게 맞을것인가...
		//키 값을 넘버로하는 이유는 회원 번호로 구분하기 위해서 사용하는 것이다.
		return mMap;
	}
	
	int check(Map<Integer, MemberDTO> mMap) {
		System.out.print("id:");
		String id=in.next();
		System.out.print("pw:");
		String pw = in.next();
		
		MemberDTO mem = null;
		int memNum=0;
		
		for(Integer memkey : mMap.keySet()) {
			mem = mMap.get(memkey);
			
			if(id.equals(mMap.get(memkey).getId())
					&&pw.equals(mMap.get(memkey).getPw())) {
				memNum = memkey;
			}
		}
		return memNum; //id,pw가 일치하는 회원데이터의 key값
	}
	
	Map<Integer, MemberDTO> login(Map<Integer, MemberDTO> mMap){
		
		int num=check(mMap);
		if(num>0) {
			MemberDTO loginmem = mMap.get(num);
			System.out.println("로그인 성공");
			System.out.println(loginmem.getId()+"님 환영합니다.");
		}
		
		return mMap;
	}
	
	
	void memberListView(Map<Integer, MemberDTO> mMap) {
		MemberDTO mem = null;
		for(Integer b: mMap.keySet()) {
			mem=mMap.get(b); // value
			System.out.print(b+"\t");
			System.out.println(mem);
			System.out.println(mMap.get(b));
		}
	}
	
	Map<Integer, MemberDTO> emailUPdate(Map<Integer, MemberDTO> mMap){
		int num=check(mMap);
		if(num>0) {
			System.out.print("변경email:");
			String email = in.next();
			MemberDTO loginmem=mMap.get(num);
			loginmem.setEmail(email);
			mMap.put(num, loginmem);
		}
		
		return mMap;
	}
	
	
}
