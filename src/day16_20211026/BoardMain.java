package day16_20211026;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Map<Integer, BoardDTO> boMap = new HashMap<>();
		
		BoardService bo = new BoardService();
		boolean run = true;
		int bnumber =1;
		
		
		while(run) {
			
			System.out.println("1.글쓰기||2.전체글조회||3.상세글조회||4.글삭제||5.글수정||6.종료");
			System.out.print("메뉴선택>");
			int menu = in.nextInt();
			
			if(menu==1) {
				boMap = bo.boardWrite(boMap); //bnumber);
				//bnumber++;
				// 메인에서 글번호를 받는 이유
				// 글삭제시 글번호가 중복되어서 서비스클래스가 아니라
				// 메인클래스에 관리해줘야한다.
			}else if(menu==2) {
				bo.boardListViwe(boMap);
				
			}else if(menu==3) {
				boMap = bo.boardView(boMap);

			}else if(menu==4) {
				boMap = bo.boardDelete(boMap);
				
			}else if(menu==5) {
				boMap=bo.boardUpdate(boMap);
			}else if(menu==6) {
				run=false;
			}
		}
		

	}

}
