package org.xuyuji.pattern.factory.factroymethod.factory;

import org.xuyuji.pattern.factory.factroymethod.product.IPhone;
import org.xuyuji.pattern.factory.factroymethod.product.Product;

public class IPhoneFactory implements FoxconnFactory {

	@Override
	public Product get() {
		return new IPhone();
	}

}
