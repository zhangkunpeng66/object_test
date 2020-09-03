zizizipackage single.lazy;

/**
 * 线程安全的懒汉单例
 * @author 80535
 *
 */
public class LazyOne {
	
	private LazyOne() {}
	
	private static LazyOne lazyOne = null;
	
	/**
	 * 懒汉单例如果想要是线程安全的，就要在获取对象的时候加同步锁，因为编译器重排序优化，会导致
	 * 获取到没有初始化完成的对象，
	 * 说明一下这里的并发问题，
	 * 通常对于懒汉式的单例，都是线程不安全的，
	 * 在getInstance的时候可能会获取到初始化未完成的对象
	 * 究其原因：这和虚拟机的编译优化有关
	 * 对Java编译器而言，初始化实例（new LazyOne()）和将对象地址写到lazyOne字段并非原子操作，
	 * 而且这两个阶段的执行顺序是未定的，假设某个线程在执行new LazyOne()操作。构造方法还没有调用，
	 * 编译器只是对该对象分配了内存空间并设为默认值，此时另一个线程调用getInstance方法，由于lazyOne对象
	 * 不为空，但是此时lazyOne对象还没有被赋予真正有效地值，从而无法取到正确的service单例对象。
	 * 
	 * 加锁synchronized  对性能影响很大，比不加锁要慢个几十倍。
	 * @return
	 */
	public static synchronized LazyOne getLazyOne() {
		if(lazyOne==null){
			lazyOne = new LazyOne();
		}
		return lazyOne;
	}

}


