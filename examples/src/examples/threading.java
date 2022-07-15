package examples;

public class threading extends Thread{
	
	public void run() {

		System.out.println("Active Thread name =" +

		Thread.currentThread().getName()); System.out.println("Active Thread priority =" +

		Thread.currentThread().getPriority()); }

		public static void main(String a[]) {

		threading mtpl = new threading(); 
		threading mtp2 = new threading(); 
		mtpl.setPriority (Thread.MIN_PRIORITY); 
		mtp2.setPriority (Thread.MAX_PRIORITY); 
		mtpl.start(); mtp2.start();
	}
}


