package question091;

public class SingletonHungry {
	
	private static SingletonHungry instance = new SingletonHungry(); // ����ʽ����ʼ����ʱ��ֱ��ʵ����
	
	private SingletonHungry() { // ���캯������Ϊ˽��
		System.out.println("execute the constructor");
	}
	
	public static SingletonHungry getInstance() { // �����Ļ�ȡʵ���ľ�̬����
		return instance;
	}
	
	public static void main(String[] args) {
		SingletonHungry singletonHungry1 = SingletonHungry.getInstance();
		SingletonHungry singletonHungry2 = SingletonHungry.getInstance();
		System.out.println(singletonHungry1); // �����hashcode��ͬ����ͬһ������
		System.out.println(singletonHungry2);
	}

}
