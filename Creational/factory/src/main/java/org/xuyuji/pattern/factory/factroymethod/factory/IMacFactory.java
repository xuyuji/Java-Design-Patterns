package org.xuyuji.pattern.factory.factroymethod.factory;

import org.xuyuji.pattern.factory.factroymethod.product.IMac;
import org.xuyuji.pattern.factory.factroymethod.product.Product;

public class IMacFactory implements FoxconnFactory {

	@Override
	public Product get() {
		return new IMac();
	}

}
