package org.xuyuji.pattern.factory.simplefactory.factory;

import org.xuyuji.pattern.factory.simplefactory.product.IMac;
import org.xuyuji.pattern.factory.simplefactory.product.IPad;
import org.xuyuji.pattern.factory.simplefactory.product.IPhone;
import org.xuyuji.pattern.factory.simplefactory.product.Product;

public class FoxconnFactory {

	public Product get(String name) {
		if ("iMac".equals(name)) {
			return new IMac();
		} else if ("iPhone".equals(name)) {
			return new IPhone();
		} else if ("iPad".equals(name)) {
			return new IPad();
		} else {
			return null;
		}
	}
}
