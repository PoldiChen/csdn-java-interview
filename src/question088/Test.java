package question088;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过反射调用对象的方法
 * @author Administrator
 *
 */
public class Test {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Dog dog = new Dog("doge");
		Method method = dog.getClass().getMethod("getName"); // 要调用的方法名作为字符串参数传入
		String name = (String) method.invoke(dog);
		System.out.println(name);
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
