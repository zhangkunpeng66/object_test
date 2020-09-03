package baidu.com.func;

import baidu.com.Milk;
import baidu.com.Yili;

public class YiliFactory implements Factory{

	/**
	 * 伊利的工厂只生产伊利，
	 */
	@Override
	public Milk getMilk() {
		return new Yili();
	}
	
	

}
