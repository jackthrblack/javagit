package day11_20211019;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {

		Board boa = new Board();

		Scanner scan = new Scanner(System.in);
		
		System.out.print("제목을 입력하세요: ");
		String tit = scan.nextLine();
		System.out.print("작성자를 입력하세요: ");
		String wit = scan.nextLine();
		System.out.print("내용을 입력하세요: ");
		String con = scan.nextLine();
		
		boa.boardWrite(tit, wit, con);
		
		boa.boardView();
		
		System.out.print("수정제목 입력: ");
		String titUp=scan.nextLine();
		System.out.print("수정내용 입력: ");
		String conUp=scan.nextLine();
		boa.boardUpdate(titUp,conUp);
		System.out.println("전체종료");

	}

}
