/**
 * @project csdn-java-interview
 * @package no39
 * @file Test.java
 * @author chenxihong
 */
package no39;

/** 
 * Class: Test
 * date: 2017年7月16日 下午3:02:16
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		System.out.println("chenxihong".substring(0, 1));
		System.out.println(reverseString("chenxihong"));
	}
	
	public static String reverseString(String str) {
		if (str == null || str.length() <= 1) {
			return str;
		}
		str = reverseString(str.substring(1)) + str.substring(0, 1); // 或 str.charAt(0)
		return str;
	}

}
