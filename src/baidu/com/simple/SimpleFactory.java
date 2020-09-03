package baidu.com.simple;

import baidu.com.Mengniu;
import baidu.com.Milk;
import baidu.com.Telunsu;
import baidu.com.Yili;

public class SimpleFactory {
	
	public Milk getMilk(String name) {
		
		if("特仑苏".equals(name)){
			return new Telunsu(); // 这个方法返回值是一个接口，返回的这个对象是继承了这个接口，这里还用到了多态，接口可以引用实现类的对象
		}else if("蒙牛".equals(name)){
			return new Mengniu();
		}else if("伊利".equals(name)){
			return new Yili();
		}
		
		return null;
	}

}
