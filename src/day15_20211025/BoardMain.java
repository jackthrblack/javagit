package day15_20211025;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		List<BoardDTO> boList = new ArrayList<>();
		
		BoardService bo = new BoardService();
		
		boolean run = true;

		while(run) {
			
			System.out.println("1.글쓰기||2.전체글조회||3.상세글조회||4.글삭제||5.글수정||6.종료");
			System.out.print("메뉴선택>");
			int menu = in.nextInt();
			
			if(menu==1) {
				boList=bo.boardWrite(boList);
			}else if(menu==2) {
				bo.boardListView(boList);
			}else if(menu==3) {
				bo.boardView(boList);
			}else if(menu==4) {
				boList=bo.boardDelete(boList);
			}else if(menu==5) {
				boList=bo.boardUpdate(boList);
				
			}else if(menu==6) {
				run=false;
				System.out.println("잘가요 내사랑~");
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}

}
