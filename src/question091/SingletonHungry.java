package question091;

public class SingletonHungry {
	
	private static SingletonHungry instance = new SingletonHungry(); // 饿汉式，初始化的时候直接实例化
	
	private SingletonHungry() { // 构造函数定义为私有
		System.out.println("execute the constructor");
	}
	
	public static SingletonHungry getInstance() { // 公开的获取实例的静态方法
		return instance;
	}
	
	public static void main(String[] args) {
		SingletonHungry singletonHungry1 = SingletonHungry.getInstance();
		SingletonHungry singletonHungry2 = SingletonHungry.getInstance();
		System.out.println(singletonHungry1); // 输出的hashcode相同，是同一个对象
		System.out.println(singletonHungry2);
	}

}
