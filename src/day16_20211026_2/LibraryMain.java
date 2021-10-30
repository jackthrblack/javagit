package day16_20211026_2;

import java.util.*;

public class LibraryMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Map<Integer, BookDTO> bkMap = new HashMap<>();
		
		
		Map<Integer, ClientDTO> cliMap = new HashMap<>();
		
		LibraryService library = new LibraryService();
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.회원등록||2.도서등록||3.도서대출||4.회원목록||5.도서목록||6.도서관퇴장");
			System.out.print("메뉴선택>");
			int menu = in.nextInt();
			
			if(menu==1) {//회원등록
				cliMap=library.clientJoin(cliMap);
			}else if(menu==2) {//도서등록
				bkMap=library.bookRegister(bkMap);
			}else if(menu==3) {//도서대출
				library.bookBorrow(bkMap, cliMap);
			}else if(menu==4) {//회원목록
				library.clientList(cliMap);
			}else if(menu==5) {//도서목록
				library.bookList(bkMap);
			}else if(menu==6) {
				run=false;
			}
		}
	}

}
