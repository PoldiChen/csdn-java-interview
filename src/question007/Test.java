/**
 * @project csdn-java-interview
 * @package no7
 * @file Test.java
 * @author chenxihong
 */
package question007;

/** 
 * Class: Test
 * date: 2017年7月16日 上午10:18:13
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		Integer i1 = 100, i2 = 100, i3 = 150, i4 = 150;
		System.out.println(i1 == i2); // 字面值在-128到127之间，直接引用常量池中的Integer对象，
		System.out.println(i3 == i4);
	}
	
}
