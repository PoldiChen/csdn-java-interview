/**
 * @project csdn-java-interview
 * @package no7
 * @file Test.java
 * @author chenxihong
 */
package question007;

/** 
 * Class: Test
 * date: 2017��7��16�� ����10:18:13
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		Integer i1 = 100, i2 = 100, i3 = 150, i4 = 150;
		System.out.println(i1 == i2); // ����ֵ��-128��127֮�䣬ֱ�����ó������е�Integer����
		System.out.println(i3 == i4);
	}
	
}
