package single.lazy;

/**
 * 使用静态内部类来解决懒加载单例的同步锁效率问题
 * 静态内部类要防止反射侵入，因为反射是可以拿到内部类的
 * @author 80535
 *
 */
public class LazyTwo {
	
	
	
	// 默认使用LazyTwo的时候，会先初始化内部类
	// 如果没使用的话，内部类是不加载的
	// 但是通过反射可以侵入内部类，使得单例变得不安全，可能会通过内部类再次创建另一个对象
	// 因此要在构造方法内，写防止反射侵入的代码
	
	private static boolean initialized = false;
	
	private LazyTwo() {
		
		// 这段代码可以避免反射侵犯，为啥我也不知道
		synchronized(LazyTwo.class){
			System.out.println("这个是类的构造方法");
			if(initialized == false){
				initialized = !initialized;
			}else{
				throw new RuntimeException("单例已被侵犯!");
			}
		}
	}
	
	
	
	
	// static 为了该单例的内存空间可以被共享
	// final保证了该方法不会被重写，重载
	public static final LazyTwo getInstance() {
		
		System.out.println("这个是公开的获取单列的方法");
		return LazyHolder.LAZY;
	}
	
	// 内部类一定是在外部类方法调用之前初始化完成的，避免了线程安全问题
	// 使用静态内部类用来新建对象，内部类是在这个外部类使用的时候先一步去加载的，
	// 外部类没有被使用内部类也不会加载
	// 所以这个还是懒汉式的单例模式
	private static class LazyHolder{
		private LazyHolder() {
			System.out.println("这是静态内部类的构造方法");
		}
		private static final LazyTwo LAZY = new LazyTwo();
		
	}
	

}


