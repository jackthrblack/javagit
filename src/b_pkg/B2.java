package b_pkg;
//소속: b_pkg
//접근제한자: public
public class B2 {

	public static void main(String[] args) {
		// B1 클래스 객체 생성
		// B1,B2는 같은 패키지(b_pkg)에 소속되어 있기 때문에 import필요 없음.
		B1 b1 = new B1();
		b1.a="aa"; // 같은 패키지 소속이기 때문에 접근 가능.
		b1.b="aa";
		b1.c="aa"; // private 이기 때문에 접근 불가능.

	}

}
