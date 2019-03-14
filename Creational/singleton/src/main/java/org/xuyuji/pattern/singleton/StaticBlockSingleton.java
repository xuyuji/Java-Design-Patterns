package org.xuyuji.pattern.singleton;

public class StaticBlockSingleton {

	private static StaticBlockSingleton instance = new StaticBlockSingleton();

	static {
		instance = new StaticBlockSingleton();
	}

	public StaticBlockSingleton getInstance() {
		return instance;
	}
}
