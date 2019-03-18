package org.xuyuji.pattern.singleton;

public class LazyThreadSafeSingleton {

	private static LazyThreadSafeSingleton INSTANCE;

	private LazyThreadSafeSingleton() {
	}

	public static synchronized LazyThreadSafeSingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LazyThreadSafeSingleton();
		}
		return INSTANCE;
	}
}
