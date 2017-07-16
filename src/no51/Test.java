/**
 * @project csdn-java-interview
 * @package no51
 * @file Test.java
 * @author chenxihong
 */
package no51;

/** 
 * Class: Test
 * date: 2017��7��16�� ����3:08:33
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) throws Exception {
		try {
			try {
				throw new Snneze();
			} catch (Annoyance annoyance) {
				System.out.println("caught annoyance");
				throw annoyance; // Snneze���ʵ����������������һ��catch��
			}
		} catch (Snneze s) {
			System.out.println("caught snneze");
			return;
		} finally {
			System.out.println("hello world");
		}
	}

}

class Annoyance extends Exception {}

class Snneze extends Annoyance {}
