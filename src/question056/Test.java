/**
 * @project csdn-java-interview
 * @package question056
 * @file Test.java
 * @author chenxihong
 */
package question056;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/** 
 * Class: Test
 * date: 2017年7月21日 下午8:04:05
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		// TreeSet
		Set<Student> set = new TreeSet<Student>(); // 放入TreeSet的类必须实现Comparable接口，compareTo方法
		set.add(new Student("chen", 20));
		set.add(new Student("wang", 21));
		set.add(new Student("zhang", 19));
		for (Student student : set) {
			System.out.println(student);
		}
		// TreeMap
		Map<Student, Parent> map = new TreeMap<Student, Parent>(); // 放入TreeMap的key的类必须实现Comparable接口，compareTo方法
		map.put(new Student("chen", 20), new Parent("CHEN"));
		map.put(new Student("wang", 21), new Parent("WANG"));
		map.put(new Student("zhang", 19), new Parent("ZHANG"));
		Set<Student> studentKeys = map.keySet();
		for (Student student : studentKeys) {
			Parent parent = map.get(student);
			System.out.println(parent);
		}
	}
}

class Student implements Comparable<Student> {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
	}
	
	@Override
	public String toString(){
		return "student [name=" + this.name + ", age=" + this.age + "]";
	}
}

class Parent {
	private String name;
	
	public Parent(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "parent [name=" + this.name + "]";
	}
}
