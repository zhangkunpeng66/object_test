package single.test;

import java.util.concurrent.CountDownLatch;

import single.lazy.LazyOne;
import single.lazy.LazyTwo;

// 对单例并发度的测试
public class ThreadSafeTest {
	
//	public static void main(String[] args) {
//		LazyTwo lazyTwo = LazyTwo.getInstance();
//	}

	public static void main(String[] args) {
		int count = 100;// 循环一百次
		CountDownLatch latch = new CountDownLatch(count); // 同步工具类，就是一百个线程的同步计时器
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < count; i++){
			
			new Thread() {
				public void run() {
					LazyOne lazyOne = LazyOne.getLazyOne(); // 线程在这里还是并发状态，多个线程都可以执行到这，但是下面这个就是阻塞方法了，多个线程要一个一个执行
					System.out.println(System.currentTimeMillis()+":"+lazyOne);
					latch.countDown(); // 用这个方法来减低count的值，
					// 当一个线程调用await()方法后，必须等数值count变成0以后才能往后执行
					
					try {
						latch.await(); // 当前是一百个线程，到这后都等着，等其他的线程都执行到了这，然后每个线程才能结束
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}.start();
			
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("总耗时："+(end-start));
		
		
				
	}
	
}

