package com.temp;

interface left{
	
	public void fun();
	default void print() {}
}

interface right{	public void fun();
	//default void print() {}
}

@FunctionalInterface
interface middle extends right{
	public void fun();
	//public void fun1();
}

public class DefaultInterfMultipleInheritance implements left,right {

	public static void main(String args[]) {
		left l = new DefaultInterfMultipleInheritance();
		l.fun();
	}

	public void method() {
		left.super.print();
	}
	public void print() {}
	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
	}

	
	
}
