package baidu.com.func;

import baidu.com.Milk;
import baidu.com.Telunsu;

public class TelunsuFactory implements Factory{

	/**
	 * 特仑苏的工厂只生产特仑苏
	 */
	@Override
	public Milk getMilk() {
		return new Telunsu();
	}
	
	

}
