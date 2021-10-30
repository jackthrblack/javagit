package day16_20211026;

import java.util.*;

public class BoardService {

	Scanner in = new Scanner(System.in);
	/*
	 * 메서드 이름 : boardWrite
	 * 리턴타입 : Map<Integer, BoardDTO>, int
	 * 매개변수 : boMap, bNumber
	 */
	Map<Integer, BoardDTO> boardWrite(Map<Integer, BoardDTO> boMap){//, int bnum){
		
		System.out.print("작성자:");
		String writer = in.next();
		System.out.print("제목:");
		String title = in.next();
		System.out.print("내용:");
		String contents = in.next();
		System.out.print("비밀번호:");
		String password = in.next();
		
		int bnumber = 1;
		int max=0;
		for(Integer a : boMap.keySet()) {
			if(a>=max) {
				max=a;
				bnumber=max+1;
			}
		}
				
		BoardDTO board = new BoardDTO(bnumber, writer, title, contents,password,0);
		//board.setBnumber(bnum);
		
		boMap.put(bnumber, board);
		
		return boMap;
	
	}
	
	/*
	 * 메서드 이름 : boardListView
	 * 리턴타입 : 없음(void)
	 * 매개변수 : boMap
	 */
	
	public void  boardListViwe(Map<Integer, BoardDTO> boMap ) {
		
		for(Integer n : boMap.keySet()) {
			System.out.println(boMap.get(n));
		}
	}
	
	/*
	 * 메서드 이름 : boardView
	 * 리턴타입 : Map<Integer, BoardDTO>
	 * 매개변수 : boMap
	 */
	
	public Map<Integer, BoardDTO> boardView(Map<Integer, BoardDTO> boMap){
		System.out.print("글번호를입력하세요>");
		int bnumber = in.nextInt();
		
		boMap.get(bnumber).setHits(boMap.get(bnumber).getHits()+1);
		System.out.println(boMap.get(bnumber).toString());
		
		return boMap;
	}

	/*
	 * 메서드 이름 : login
	 * 리턴타입 : int
	 * 매개변수 : boMap
	 */
	public int login(Map<Integer, BoardDTO>boMap) {
		System.out.print("bnumber:");
		int bnumber=in.nextInt(); //변수 타입을 잘 확인하자.
		System.out.print("password:");
		String password = in.next();
		
		BoardDTO mem = null;
		int num = 0;
		
		for(Integer boKey : boMap.keySet()) {
			mem = boMap.get(boKey);
			
			if(bnumber==boMap.get(boKey).getBnumber()
					&&password.equals(boMap.get(boKey).getPassword())) {
				num=boKey;
			}
			
		}
		return num;
	}
	
	/*
	 * 메서드 이름 : boardDelete
	 * 리턴타입 : Map<Integer, BoardDTO>
	 * 매개변수 : boMap
	 */
	
	public Map<Integer, BoardDTO> boardDelete(Map<Integer, BoardDTO> boMap){
		
		int loginResult = login(boMap);
		
		if(loginResult>0) {
			boMap.remove(loginResult);
		}else {
			System.out.println("다시입력해주세요");
		}
		
		return boMap;
	}
	
	/*
	 * 메서드 이름 : boardUpdate
	 * 리턴타입 : Map<Integer, BoardDTO>
	 * 매개변수 : boMap
	 */
	
	public Map<Integer, BoardDTO> boardUpdate(Map<Integer, BoardDTO> boMap){
		int loginResult = login(boMap);
		if(loginResult>0) {
			System.out.print("수정제목>");
			String title = in.next();
			boMap.get(loginResult).setTitle(title);
			System.out.print("수정내용>");
			String contents = in.next();
			boMap.get(loginResult).setContents(contents);
			System.out.println(boMap.get(loginResult).toString());
		}else {
			System.out.println("다시입력해주세요");
		}
		return boMap;
	}
	
	
	}
