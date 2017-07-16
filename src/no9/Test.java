/**
 * @project csdn-java-interview
 * @package no9
 * @file Test.java
 * @author chenxihong
 */
package no9;

/** 
 * Class: Test
 * date: 2017年7月16日 上午10:23:16
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		String str1 = new StringBuilder("go").append("od").toString();
		System.out.println(str1.intern() == str1);
		String str2 = new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern() == str2);
		String str3 = "java";
		System.out.println(str3.intern() == str3);
	}

}
