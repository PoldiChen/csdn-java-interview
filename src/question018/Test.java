/**
 * @project csdn-java-interview
 * @package question018
 * @file Test.java
 * @author chenxihong
 */
package question018;

/** 
 * Class: Test
 * date: 2017��7��16�� ����2:15:10
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	private int a;
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getA(){
		return a;
	}
	
	public void add(Test test) {
		test.setA(200);
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.setA(100);
		test.add(test);
		System.out.println(test.getA());
	}

}
