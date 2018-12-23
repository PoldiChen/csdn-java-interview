package question086;

import java.lang.reflect.InvocationTargetException;

public class Test {
	
	public static void main(String[] args) {
		try {
			String str1 = String.class.newInstance(); // 反射获得对象
			str1 = "test";
			String str2 = String.class.getConstructor(String.class).newInstance("test"); // 获得构造器后再反射获得对象
			System.out.println(str1);
			System.out.println(str2);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}

}
