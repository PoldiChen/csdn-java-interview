package question056;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSort {
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(10, "chen"));
		list.add(new Student(11, "wang"));
		list.add(new Student(9, "zhang"));
		Collections.sort(list, new Comparator<Student>() { // 需要传入Comparator参数
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getAge() - s2.getAge();
			}
		});
		for (Student student : list) {
			System.out.println(student);
		}
	}

}

class Student{
	private int age;
	private String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "[student name=" + name + ",age=" + age + "]";
	}
}
