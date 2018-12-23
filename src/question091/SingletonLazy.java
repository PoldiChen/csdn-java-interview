package question091;

public class SingletonLazy {
	
	private static SingletonLazy instance;
	
	private SingletonLazy() {
		System.out.println("execute the constructor");
	}
	
	public static SingletonLazy getInstance() {
		if (instance == null) { // 获取实例的方法被调用时才实例化
			instance = new SingletonLazy();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
		SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
		System.out.println(singletonLazy1); // 输出的hashcode相同，是同一个对象
		System.out.println(singletonLazy2);
	}

}
