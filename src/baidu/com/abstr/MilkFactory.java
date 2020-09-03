package baidu.com.abstr;

import baidu.com.Mengniu;
import baidu.com.Milk;
import baidu.com.Telunsu;
import baidu.com.Yili;

public class MilkFactory extends AbstractFactory{

	@Override
	public Milk getMengniu() {
		return new Mengniu();
	}

	@Override
	public Milk getYili() {
		return new Yili(); // 这样也是可以的，这就是抽象工厂模式的写法
	}

	@Override
	public Milk getTelunsu() {
		return new Telunsu();
		//return new TelunsuFactory().getMilk();// 这个是抽象工厂模式和工厂方法的组合使用，和上面一样的。
	}

}
