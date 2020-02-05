package com.creational.dp.singleton;

public class SingletonWithInnerClass {
	private static class SingletonHelper {
		private static final SingletonWithInnerClass singletonWithInnerClass = new SingletonWithInnerClass();
		
	}
	
	private SingletonWithInnerClass() {
		if(SingletonHelper.singletonWithInnerClass != null) {
			throw new RuntimeException("Use getInstance method.");
		}
	}
	
	public static SingletonWithInnerClass getInstance() {
		return SingletonHelper.singletonWithInnerClass;
	}
}
