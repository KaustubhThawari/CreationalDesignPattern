package com.creational.dp.singleton;

import java.lang.reflect.Constructor;

public class SingletonBreakDemo {

	public static void main(String[] args) {
		// With standard(synchronized) Singleton
		try {
			Class<?> clazz = Class.forName("com.creational.dp.singleton.DbSingleton");
			Constructor<?>[] cons = clazz.getDeclaredConstructors();
			for (int i = 0; i < cons.length; i++) {
				Constructor<?> con = cons[i];
				con.setAccessible(true);
				System.out.println("Synchronized Singleton : " + con.newInstance());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// With bill pugh(inner class) Singleton
		try {
			Class<?> clazz = Class.forName("com.creational.dp.singleton.SingletonWithInnerClass");
			Constructor<?>[] cons = clazz.getDeclaredConstructors();
			for (int i = 0; i < cons.length; i++) {
				Constructor<?> con = cons[i];
				con.setAccessible(true);
				System.out.println("Inner class Singleton : " + con.newInstance());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
