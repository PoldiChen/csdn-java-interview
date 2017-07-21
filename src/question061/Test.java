/**
 * @project csdn-java-interview
 * @package question061
 * @file Test.java
 * @author chenxihong
 */
package question061;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/** 
 * Class: Test
 * date: 2017年7月21日 下午8:48:01
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		List<Future<Integer>> list = new ArrayList<>();
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i=0; i<10; i++) {
			list.add(service.submit(new MyTask((int) (Math.random() * 100))));
		}
		int sum = 0;
		for (Future<Integer> future : list) {
			sum += future.get();
		}
		System.out.println(sum);
	}
}

class MyTask implements Callable<Integer> { // 实现多线程的第三种方式，实现Callable接口，重写call方法，可以返回值
	private int count;
	
	public MyTask(int count) {
		this.count = count;
	}
	
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i=1; i<count; i++) {
			sum += i;
		}
		return sum;
	}
	
}
