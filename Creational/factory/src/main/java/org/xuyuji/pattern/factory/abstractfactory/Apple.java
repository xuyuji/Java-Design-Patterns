package org.xuyuji.pattern.factory.abstractfactory;

import org.xuyuji.pattern.factory.abstractfactory.factory.FoxconnFactory;
import org.xuyuji.pattern.factory.abstractfactory.factory.PegatronFactory;

public class Apple {

	public static void main(String[] args) {
		FoxconnFactory factory1 = new FoxconnFactory();
		factory1.getIMac().desc();
		factory1.getIPad().desc();
		factory1.getIPhone().desc();

		PegatronFactory factory2 = new PegatronFactory();
		factory2.getIMac().desc();
		factory2.getIPad().desc();
		factory2.getIPhone().desc();
	}
}
