package org.xuyuji.pattern.factory.simplefactory;

import org.xuyuji.pattern.factory.simplefactory.factory.FoxconnFactory;

public class Apple {

	public static void main(String[] args) {
		FoxconnFactory factory = new FoxconnFactory();
		factory.get("iMac").desc();
		factory.get("iPad").desc();
		factory.get("iPhone").desc();
	}
}
