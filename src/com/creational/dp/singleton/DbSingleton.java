package com.creational.dp.singleton;

public class DbSingleton {
	private static DbSingleton dbSingleton = null;
	
	private DbSingleton() {
		if(dbSingleton != null) {
			throw new RuntimeException("Use getInstance method.");
		}
	}
	
	public static DbSingleton getInstance() {
		if(dbSingleton == null) {
			synchronized (DbSingleton.class) {
				if(dbSingleton == null) {
					dbSingleton = new DbSingleton();
				}
			}
		}
		
		return dbSingleton;
	}
}
