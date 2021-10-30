package day17_20211027_3;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDTO t1= new TestDTO("aaa","bbb");
		TestDTO t2 = new TestDTO("aaa","bbb");
		
		//t1객체 필드값과 t2객체 필드값이 같은지
		System.out.println(t1.equals(t2));
		
		 System.out.println(t1.hashCode());
		 System.out.println(t2.hashCode());
		
		
		
	}

}
