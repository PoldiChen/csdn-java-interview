/**
 * @project csdn-java-interview
 * @package no22
 * @file Test.java
 * @author chenxihong
 */
package no22;

/** 
 * Class: Test
 * date: 2017��7��16�� ����2:40:09
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		char[] chars = "��".toCharArray();
		char ch = '��'; // ""��ʼ���ַ�����''��ʼ���ַ�
		System.out.println(chars[0]);
		System.out.println(ch);
	}

}
