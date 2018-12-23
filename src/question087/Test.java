package question087;

import java.lang.reflect.Field;

/**
 * ͨ�������ȡ�����˽���ֶε�ֵ
 * @author Administrator
 *
 */
public class Test {
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Dog dog = new Dog("doge");
		Class<?> clazz = dog.getClass();
		Field[] fields = clazz.getDeclaredFields(); // ��ȡ������ֶ�
		for (Field field : fields) {
			field.setAccessible(true); // �����ֶ�Ϊ�ɷ���
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
