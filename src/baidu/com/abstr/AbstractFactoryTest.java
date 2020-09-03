package baidu.com.abstr;

public class AbstractFactoryTest {
	
	public static void main(String[] args) {
		
		MilkFactory factory = new MilkFactory();
		
		// 在用户调用的时候只能是根据已经存在的产品，不用额外输入任何参数。
		System.out.println(factory.getMengniu());
	}

}
