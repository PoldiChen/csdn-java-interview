/**
 * @project csdn-java-interview
 * @package question060
 * @file Test.java
 * @author chenxihong
 */
package question060;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
 * Class: Test
 * date: 2017年7月21日 下午8:29:22
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		Account account = new Account();
		ExecutorService service = Executors.newFixedThreadPool(100);
		for (int i=0; i<100; i++) {
			service.execute(new AddMoneyThread(account, 1)); // 未同步时，多个线程加1的时候原来的值都是0
		}
		service.shutdown();
		while (!service.isTerminated()) {
			System.out.println(account.getBalance());
		}
	}
}

class AddMoneyThread implements Runnable {
	private Account account;
	private int money;
	public AddMoneyThread(Account account, int money) {
		this.account = account;
		this.money = money;
	}
	@Override
	public void run() {
		synchronized (account) { // 同步方式之一
			account.deposit(money);
		}
	}
}

class Account {
	private int balance;
	
	public synchronized void deposit(int money) { // 同步方式之一
		int newBalance = this.balance + money;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = newBalance;
	}
	
	public int getBalance() {
		return this.balance;
	}
}
