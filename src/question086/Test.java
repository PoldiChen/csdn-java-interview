package question086;

import java.lang.reflect.InvocationTargetException;

public class Test {
	
	public static void main(String[] args) {
		try {
			String str1 = String.class.newInstance(); // �����ö���
			str1 = "test";
			String str2 = String.class.getConstructor(String.class).newInstance("test"); // ��ù��������ٷ����ö���
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
