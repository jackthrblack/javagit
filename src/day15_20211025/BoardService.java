package day15_20211025;

import java.util.*;

public class BoardService {

	Scanner in = new Scanner(System.in);

	/*
	 * 메서드 이름: boardWrite 
	 * 리턴타입 : List<BoardDTO> 
	 * 매개변수 : botList
	 */
	List<BoardDTO> boardWrite(List<BoardDTO> boList) {
		System.out.print("작성자:");
		String writer = in.next();
		System.out.print("제목:");
		String title = in.next();
		System.out.print("내용:");
		String contents = in.next();
		System.out.print("비밀번호:");
		String password = in.next();

		int bnumber = boList.size();

		BoardDTO board = new BoardDTO(bnumber, writer, title, contents, password, 0);
		boList.add(board);
		return boList;
	}

	/*
	 * 메서드 이름: boardListView 
	 * 리턴타입 : List<BoardDTO> 
	 * 매개변수 : 없음(void)
	 */
	void boardListView(List<BoardDTO> boList) {
		for (BoardDTO m : boList) {
			System.out.println(m);
		}
	}

	/*
	 * 메서드 이름: check 
	 * 리턴타입 : List<BoardDTO> 
	 * 매개변수 : botList
	 */
	int check(List<BoardDTO> boList) {
		System.out.print("글번호를입력하세요>");
		int bnumber = in.nextInt();
		System.out.print("비밀번호입력하세요>");
		String password = in.next();
		int num = -1;
		for (int i = 0; i < boList.size(); i++) {
			if (bnumber == boList.get(i).getBnumber() && password.equals(boList.get(i).getPassword())) {
				num = i;
			}
		}
		return num;
	}

	/*
	 * 메서드 이름: boardView 
	 * 리턴타입 : 없음(void) 
	 * 매개변수 : botList
	 */

	List<BoardDTO> boardView(List<BoardDTO> boList) {

		System.out.print("글번호를입력하세요>");
		int bnumber = in.nextInt();
		
		//for(int i =0; i<boList.size().i++){
			//if(bnumber==boList.get(i).getBunmber()){
				//조회수 증가
//				int oldHits = boList.get(i).getHits();
//				int newHits=oidHits+1;
//				boList.get(i).setHits(newHits);
//					System.out.println(boList.get(i));
//				int newHits1=boList.get(i).getHits()+1;
//				boList.get(i).setHits(newHits1);
//	}
//}

		boList.get(bnumber).setHits(boList.get(bnumber).getHits() + 1);
		System.out.println(boList.get(bnumber).toString());
		
		return boList;
	}
	
//	int hit=0;
//	void boardView2(List<BoardDTO> boList) {
//		
//		System.out.print("글번호를입력하세요>");
//		int bnumber = in.nextInt();
//		
//		boolean a =false;
//		int b=0;
//		//int hit =0 이 여기에 있으면 3번을 호출 할때마다 리셋된다.
//		for(int i=0; i<boList.size(); i++) {
//			//hit이 여기에 있으면 내가 보고싶은 글의 조회수가 올라가는 것이 아닌 그냥 모든 전체 조회수가 올라간다.
//			if(bnumber==boList.get(i).getBnumber()) {
//				a=true;
//				b=i;
//			}
//			if(a) {
//				hit++;
//				boList.get(b).setHits(hit);
//				//이렇게 있을경우 마찬가지로 전체 조회수가 올라간다.
//				System.out.println(boList.get(b).toString());
//			}
//		} 
//	}// 만약 내가 3개의 리스트를 만들고 0번째 인덱스를 호출하면 0번째가 3번 나오는 이유ㄴ
//	// boList의 사이즈는 3이고 인덱스는 0,1,2 이렇게 있으니 계속해서 계속 반복하는 것이다.

	/*
	 * 메서드 이름: boardDelete 
	 * 리턴타입 : List<BoardDTO> S
	 * 매개변수 : botList
	 */

	List<BoardDTO> boardDelete(List<BoardDTO> boList) {

		int result = check(boList);
		if (result >= 0) {
			boList.remove(result);
			//remove를 잊지말
		}
		return boList;
	}

	/*
	 * 메서드 이름: boardUpdate 
	 * 리턴타입 : List<BoardDTO> 
	 * 매개변수 : botList
	 */
	List<BoardDTO> boardUpdate(List<BoardDTO> boList) {

		int result = check(boList);

		if (result >= 0) {
			System.out.print("수정제목>");
			String title = in.next();
			boList.get(result).setTitle(title);
			System.out.print("수정내용>");
			String contents = in.next();
			boList.get(result).setContents(contents);
			System.out.println(boList.get(result).toString());
		}
		return boList;
	}

}
