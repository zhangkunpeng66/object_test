package single.lazy;

public class One {
	
	// 一个boobler值
	private static boolean inits = false;
	
	// 在构造方法里判断
	private One () {
		
		synchronized (One.class) {
			if(inits == false){
				inits = !inits;
			}else {
				throw new RuntimeException("单列已被侵犯");
			}
			
		}
		
		
		
	}
	
	public static One getOne() {
		return OneLazy.LAZY;
	}
	
	private static class OneLazy {
		private static final One LAZY = new One();
	}

}
