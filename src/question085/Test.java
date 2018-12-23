package question085;

/**
 * 获得一个类的类对象的三种方式
 * @author Administrator
 *
 */
public class Test {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ClassNotFoundException {
		Class<String> class1 = String.class;
		Class<String> class2 = (Class<String>) "test".getClass();
		Class<String> class3 = (Class<String>) Class.forName("java.lang.String");
		System.out.println(class1);
		System.out.println(class2);
		System.out.println(class3);
	}

}
