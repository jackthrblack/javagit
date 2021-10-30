package day02_20211005;

public class Ex2 {

	public static void main(String[] args) {
		// 증감연산자
		int result = 0, var = 10;
		
//		System.out.println("result: " + result + "var: " + var);
//		result = 10 + var++;
//		System.out.println("result: " + result + "var: " + var);
//		result = 10 + var++;
//		System.out.println("result: " + result + "var: " + var);
//		// result:21  var: 12
//		result = 10 + var--;
//		System.out.println("result: " + result + "var: " + var);
//		// result:22  var:11 
//		result = 10 + var--;
//		System.out.println("result: " + result + "var: " + var);
//		// result:21  var:10
		
		result = 0;
		var = 10;
		result = 10+ ++var;
		System.out.println("result: " + result + "var: " + var);
//		//result:21 var: 11
		result = 10+ ++var;
		System.out.println("result: " + result + "var: " + var);
//		//result:22 var: 12
		result = 10+ --var;
		System.out.println("result: " + result + "var: " + var);
		//result:21 var: 11
		result = 10+ --var;
		System.out.println("result: " + result + "var: " + var);
//		//result:20 var: 10
		
	
		
	}

}