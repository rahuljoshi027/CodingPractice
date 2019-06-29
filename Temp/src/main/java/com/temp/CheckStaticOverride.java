package com.temp;


interface InterfA{
	
	default void myMethod() {}
	
	static void myMethod(int i) {}
}

interface InterfB{
	
	default void myMethod() {}
}

class child implements InterfA,InterfB{

	@Override
	 public void myMethod() 
	 {
		InterfA.super.myMethod();
	}
	
	public static void main(String args[]) {
		
		child c = new child();
		
	}
	public void met() {
		InterfA.super.myMethod();
	}
	
}

class parent{
	
	public static void method() {
		System.out.println(" in parent");
	}
}

public class CheckStaticOverride extends parent{

	public static void method() {
		System.out.println(" in child");
	}
	public void method(int i) {}
	public static void main(String args[]) {
		
		parent o = new CheckStaticOverride();
		o.method();
		
		CheckStaticOverride o1 = new CheckStaticOverride();
		o1.method();
	}
}
