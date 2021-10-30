package day15_20211025_2;

public class TestDTO {

	private int number;
	private String val1;
	private String val2;
	
	public TestDTO() {
		
	}

	public TestDTO(int number, String val1, String val2) {
		this.number = number;
		this.val1 = val1;
		this.val2 = val2;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getVal1() {
		return val1;
	}

	public void setVal1(String val1) {
		this.val1 = val1;
	}

	public String getVal2() {
		return val2;
	}

	public void setVal2(String val2) {
		this.val2 = val2;
	}

	@Override
	public String toString() {
		return "TestDTO [number=" + number + ", val1=" + val1 + ", val2=" + val2 + "]";
	}
	
	
	
}
