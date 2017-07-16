/**
 * @project csdn-java-interview
 * @package no37
 * @file Test.java
 * @author chenxihong
 */
package no37;

/** 
 * Class: Test
 * date: 2017��7��16�� ����2:53:54
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		A b = new B(); // ��ʼ����̬��Ա�����ø��๹��������ʼ���Ǿ�̬��Ա��������������
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
