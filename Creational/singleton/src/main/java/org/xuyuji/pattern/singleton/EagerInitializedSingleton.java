package org.xuyuji.pattern.singleton;

public class EagerInitializedSingleton {

	private static EagerInitializedSingleton instance = new EagerInitializedSingleton();

	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
}
