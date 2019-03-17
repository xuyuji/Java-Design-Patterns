package org.xuyuji.pattern.factory.factroymethod;

import org.xuyuji.pattern.factory.factroymethod.factory.FoxconnFactory;
import org.xuyuji.pattern.factory.factroymethod.factory.IMacFactory;
import org.xuyuji.pattern.factory.factroymethod.factory.IPadFactory;
import org.xuyuji.pattern.factory.factroymethod.factory.IPhoneFactory;

public class Apple {

	public static void main(String[] args) {
		FoxconnFactory iMacFactory = new IMacFactory();
		iMacFactory.get().desc();

		FoxconnFactory iPhoneFactory = new IPhoneFactory();
		iPhoneFactory.get().desc();

		FoxconnFactory iPadFactory = new IPadFactory();
		iPadFactory.get().desc();
	}
}
