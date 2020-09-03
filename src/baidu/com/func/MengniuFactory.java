package baidu.com.func;

import baidu.com.Mengniu;
import baidu.com.Milk;

public class MengniuFactory implements Factory{

	/**
	 * 蒙牛的工厂只生产蒙牛，
	 */
	@Override
	public Milk getMilk() {
		return new Mengniu();
	}
	
	

}
