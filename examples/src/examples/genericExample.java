package examples;

class Test<T> {
	T obj; 
	// constructor
	Test (T obj) {
		this.obj=obj;
	} 
	public T getObject() {
		return this.obj; 
	}
}

public class genericExample {

	public static void main(String[] args) { 
		Test<Integer> jobj = new Test<Integer> (15); 
		System.out.println(jobj.getObject());
		Test<String> mobj= new Test<String> ("This is an example for Generics example "); 
		System.out.println(mobj.getObject());

	}
}
	

// ******************************** INCOMPLETE ************************************
// ********************************Resolve error***********************************