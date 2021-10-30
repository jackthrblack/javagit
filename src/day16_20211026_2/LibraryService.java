package day16_20211026_2;

import java.util.*;

public class LibraryService {

	Scanner in = new Scanner(System.in);

	Map<Integer, ClientDTO> clientJoin(Map<Integer, ClientDTO> cliMap) {

		System.out.print("고객이름:");
		String name = in.next();
		System.out.print("전화번호:");
		String phone = in.next();

		int clientNumber = 1;
		int max = 0;
		for (Integer a : cliMap.keySet()) {
			if (a >= max) {
				max = a;
				clientNumber = max + 1;
			}
		}

		ClientDTO client = new ClientDTO(clientNumber, name, phone);

		cliMap.put(clientNumber, client);
		return cliMap;
	}

	void clientList(Map<Integer, ClientDTO> cliMap) {

		for (Integer n : cliMap.keySet()) {
			System.out.println(cliMap.get(n));
		}
	}

	Map<Integer, BookDTO> bookRegister(Map<Integer, BookDTO> bkMap) {

		System.out.print("책이름:");
		String bookname = in.next();
		System.out.print("작가:");
		String author = in.next();
		boolean bookCheck = true;
		int clientNumber = 0;
		int bookNum = 1;
		int max = 0;
		for (Integer a : bkMap.keySet()) {
			if (a >= max) {
				max = a;
				bookNum = max + 1;
			}
		}
		BookDTO book = new BookDTO(bookNum, bookname, author, bookCheck, clientNumber);
		bkMap.put(bookNum, book);
		return bkMap;
	}

	void bookList(Map<Integer, BookDTO> bkMap) {
		for (Integer b : bkMap.keySet()) {
			System.out.println(bkMap.get(b));
		}
	}

	int cliCheck(Map<Integer, ClientDTO> cliMap) {
		System.out.print("고객번호:");
		int cliNum = in.nextInt();

		int cResult = 0;
		ClientDTO cli = null;

		for (Integer cliKey : cliMap.keySet()) {
			cli = cliMap.get(cliKey);
			if (cliNum == cliMap.get(cliKey).getClientNumber()) {
				cResult = cliKey;
			}
		}

		return cResult;
	}

	int bkCheck(Map<Integer, BookDTO> bkMap) {
		System.out.print("도서번호:");
		int bookNum = in.nextInt();

		int bResult = 0;
		BookDTO bk = null;
		for (Integer bkKey : bkMap.keySet()) {
			bk = bkMap.get(bkKey);
			if (bookNum == bkMap.get(bkKey).getBookNumber()) {
				bResult = bkKey;
			}
		}

		return bResult;
	}

	int bookBorrow(Map<Integer, BookDTO> bkMap, Map<Integer, ClientDTO> cliMap) {

		boolean result = true;
		int cliLogin = cliCheck(cliMap);
		int bookLogin = bkCheck(bkMap);

		if (cliLogin > 0) {
			if (bookLogin > 0) {
				if (bkMap.get(bookLogin).isBookCheck()) { // boolean 타입일 경우 앞에 is가 붙는다.
					result = false;
					System.out.println("대출완료");
					bkMap.get(bookLogin).setBookCheck(result);
				} else {
					System.out.println("이미 대출 중 입니다.");
				}
			}
		} else {
			System.out.println("고객번호를 다시 확인해주세요.");
		}
		// 계속 헤맸던 이유
		// 1. 책을 빌린거 까지는 했으나 대출한 책을 다시 해보니 대출완료, 대출중입니다 이 두개가 떴다.
		// => if(bookLogin>0)이 안에 중첩if로 넣어서 둘 다 출력됐다.
		// 2. 대출중인 if문을 if(bookLogin>0)의 else로 해도 1번과 똑같은 결과였다.
		// 3. 그래서 if(cliLogin>0)의 else로 혹시나하고 넣어봤는데 역시나 안됐다.

		return 0;
	}

	// 리스트를 사용해서 하는 법

	public List<BookDTO> borrowBook(List<BookDTO> bookList, List<ClientDTO> clientList) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("고객번호:");
		int cliNum = in.nextInt();
		System.out.print("도서번호:");
		int bookNum = in.nextInt();

		// 해당 고객번호가 어떤 인덱스에 있는지 체크
		int clientIndex = cCheck(clientList, clientNumber);
		int bookIndex = bCk(bookList, bookNumber);

		if (clientIndex > 0 && bookIndex > 0) { // 고객,책정보 유효
			if (bookList.get(bookIndex).isBookCheck()) {
				// bookCheck: true -> 대출가능, bookCheck: false -> 대출불가능
				bookList.get(bookIndex).setClientNumber(clientNumber);
				bookList.get(bookIndex).setBookCheck(false);
				
				// ClientDTO 타입의 bookBorrowed 필드에 데이터 저장
				// 대출하고자 하는 고개정보를 가져옴
				ClientDTO client = clientList.get(clientIndex);
				bookList.get(bookIndex).setBookBorrowed(client);
				
				bookList.get(bookIndex).setBookBorrowed(clientList.get(clientIndex));
				
				System.out.println(bookList.get(bookIndex).getBookBorrowed().getClientName());
			} else {
				System.out.println("도서는 이미 대출중 입니다.");
			}
		} else {
			System.out.println("정보가 유효하지 않습니다.");
		}

		return bookList;
	}

	int cCheck(List<ClientDTO> clientList, int clientNumber) {
		int clResult = -1;

		for (int i = 0; i < clientList.size(); i++) {
			if (clientNumber == clientList.get(i).getClientNumber())
				clResult = i;
		}

		return clResult;
	}

	int bCk(List<BookDTO> bookList, int clientNumber) {
		int bkResult = -1;

		for (int i = 0; i < bookList.size(); i++) {
			if (bookNumber == bookList.get(i).getBookNumber())
				bkResult = i;
		}

		return bkResult;
	}

}
