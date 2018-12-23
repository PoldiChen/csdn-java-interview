package question087;

import java.lang.reflect.Field;

/**
 * 通过反射获取对象的私有字段的值
 * @author Administrator
 *
 */
public class Test {
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Dog dog = new Dog("doge");
		Class<?> clazz = dog.getClass();
		Field[] fields = clazz.getDeclaredFields(); // 获取对象的字段
		for (Field field : fields) {
			field.setAccessible(true); // 设置字段为可访问
			Object fieldVal = (String) field.get(dog);
			System.out.println(String.valueOf(fieldVal));
		}
	}

}

class Dog {
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
