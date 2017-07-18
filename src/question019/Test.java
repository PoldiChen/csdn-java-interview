/**
 * @project csdn-java-interview
 * @package no19
 * @file Test.java
 * @author chenxihong
 */
package question019;

/** 
 * Class: Test
 * date: 2017年7月16日 下午2:18:47
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void func1(){
		String str1 = "programming";
		String str2 = new String("programming");
		String str3 = "program";
		String str4 = "ming";
		String str5 = "program" + "ming"; 
		String str6 = str3 + str4; // 创建StringBuilder对象，append方法，toString
		
		System.out.println(str1 == str2); // false
		System.out.println(str1 == str5); // true
		System.out.println(str1 == str6); // false
		System.out.println(str1 == str6.intern()); // true
		System.out.println(str2 == str2.intern()); // false
	}
	
	public static void func2(){
		long time1 = System.currentTimeMillis();
		String str1 = "a";
		for (int i=0; i<100000; i++) {
			str1 += "b";
		}
		long time2 = System.currentTimeMillis();
		StringBuilder str2 = new StringBuilder("a");
		for (int i=0; i<100000; i++) {
			str2.append("b");
		}
		long time3 = System.currentTimeMillis();
		System.out.println(str1.length());
		System.out.println(str2.toString().length());
		System.out.println(time2-time1);
		System.out.println(time3-time2);
	}
	
	public static void main(String[] args) {
		func2();
	}

}
