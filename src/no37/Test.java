/**
 * @project csdn-java-interview
 * @package no37
 * @file Test.java
 * @author chenxihong
 */
package no37;

/** 
 * Class: Test
 * date: 2017年7月16日 下午2:53:54
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		A b = new B(); // 初始化静态成员，调用父类构造器，初始化非静态成员，调用自身构造器
		b = new B();
	}
}

class A {
	
	static {
		System.out.println("static A");
	}
	
	public A() {
		System.out.println("construct A");
	}
}

class B extends A {
	
	static {
		System.out.println("static B");
	}
	
	public B() {
		System.out.println("construct B");
	}
}
