package com.creational.dp.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		try {
			System.out.println("Synchronized Singleton : "
					+ "[first call: " +DbSingleton.getInstance()+", "
							+ "second call: "+DbSingleton.getInstance()+"]");
			System.out.println("Inner class Singleton : "
					+ "[first call: " +SingletonWithInnerClass.getInstance()+", "
							+ "second call: "+SingletonWithInnerClass.getInstance()+"]");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
