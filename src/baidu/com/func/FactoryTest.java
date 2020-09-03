package baidu.com.func;

import baidu.com.Mengniu;
import baidu.com.Milk;

public class FactoryTest {
	
	public static void main(String[] args) {
		// System.out.println(new Factory().getMilk());
		
		// 这里对工厂也进行了抽象，用工厂接口，引用具体产品的工厂实例
		// 但是这里需要用户去自己选择具体的产品工厂，不划算，应该是，我要产品，你给我产品就行了，我不需要知道工厂
		// 因为以上问题，就有了更加复杂的工厂模式，抽象工厂模式abstract
		Factory factory = new MengniuFactory();
		
		System.out.println(factory.getMilk());
		
	}

}
