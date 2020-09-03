package baidu.com.simple;

import baidu.com.Telunsu;

public class SimpleFactoryTest {
	
	public static void main(String[] args) {
		
		// 这里的new的过程实际上是更复杂的情况
		// System.out.println(new Telunsu().getName());
		
		// 小作坊式的生产模式，用户不再关心生产的过程，而只需要关心这个结果，那么这个小作坊内，就封装了各种对象的生产过程。
		SimpleFactory simpleFactory = new SimpleFactory();
		simpleFactory.getMilk("特仑苏"); // 我们要什么，工厂就可以根据我们提供的东西，给我们对应的对象（产品）
		
	}

}
