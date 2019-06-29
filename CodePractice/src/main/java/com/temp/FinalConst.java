package com.temp;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class FinalConst implements my{

	private FinalConst(){}
	
	public static void main(String[] args) {
	 new my() {}.fun();;
	}

}

interface my{
	default void fun() {}
}

class excep implements RejectedExecutionHandler{


	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		// TODO Auto-generated method stub
		
	}}
 