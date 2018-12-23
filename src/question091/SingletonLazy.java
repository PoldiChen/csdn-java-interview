package question091;

public class SingletonLazy {
	
	private static SingletonLazy instance;
	
	private SingletonLazy() {
		System.out.println("execute the constructor");
	}
	
	public static SingletonLazy getInstance() {
		if (instance == null) { // ��ȡʵ���ķ���������ʱ��ʵ����
			instance = new SingletonLazy();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
		SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
		System.out.println(singletonLazy1); // �����hashcode��ͬ����ͬһ������
		System.out.println(singletonLazy2);
	}

}
