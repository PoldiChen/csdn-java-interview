/**
 * @project csdn-java-interview
 * @package no5
 * @file Test.java
 * @author chenxihong
 */
package no5;

/** 
 * Class: Test
 * date: 2017年7月16日 上午10:09:25
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		short s1 = 1;
//		s1 = s1 + 1; // cannot convert from int to short
		s1 += 1; // 相当于 s1 = (short)(s1+1);隐含的强制类型转换
		System.out.println(s1);
	}

}
