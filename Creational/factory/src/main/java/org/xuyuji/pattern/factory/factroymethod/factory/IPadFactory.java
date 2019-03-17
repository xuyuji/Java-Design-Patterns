package org.xuyuji.pattern.factory.factroymethod.factory;

import org.xuyuji.pattern.factory.factroymethod.product.IPad;
import org.xuyuji.pattern.factory.factroymethod.product.Product;

public class IPadFactory implements FoxconnFactory {

	@Override
	public Product get() {
		return new IPad();
	}

}
