package baidu.com.abstr;

import baidu.com.Milk;

/**
 * 抽象工厂是用户的主入口
 * 在spring种应用的最为广泛的一种设计模式
 * @author 80535
 *
 */
public abstract class AbstractFactory {
	
	// 抽象工厂类有利于公共逻辑的处理
	// 方便统一管理
	// 易于扩展，如果现在有一个三鹿奶粉加入，那么，除了三鹿自己的实现，
	// 只需要在抽象工厂类里添加一个获得一个三鹿奶粉的抽象方法就行了

	/**
	 * 获得一个蒙牛品牌的牛奶
	 * @return
	 */
	public abstract Milk getMengniu();
	
	/**
	 * 获得一个伊利品牌的牛奶
	 * @return
	 */
	public abstract Milk getYili();
	
	/**
	 * 获得一个特仑苏品牌的牛奶
	 * @return
	 */
	public abstract Milk getTelunsu();
}
