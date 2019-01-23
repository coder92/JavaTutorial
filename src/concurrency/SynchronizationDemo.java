package concurrency;

public class SynchronizationDemo {

	private static int count=0;
	//private Thread t;
	
	static SynchronizationDemo instance=null;
	
	private SynchronizationDemo() {
		
	}
	
	
	
	public static void main(String[] args) {
		instance = new SynchronizationDemo();
		
		/*ThreadDemo1 td1 = new ThreadDemo1("td1",1,10);
		ThreadDemo1 td2 = new ThreadDemo1("td2",1,10);*/
		
	}

	synchronized protected void incCount(String name) {
		this.count++;
		System.out.println("name="+name+"  count="+count);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}