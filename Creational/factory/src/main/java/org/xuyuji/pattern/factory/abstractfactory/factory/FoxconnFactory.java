package org.xuyuji.pattern.factory.abstractfactory.factory;

import org.xuyuji.pattern.factory.abstractfactory.product.IMac;
import org.xuyuji.pattern.factory.abstractfactory.product.IMac1;
import org.xuyuji.pattern.factory.abstractfactory.product.IPad;
import org.xuyuji.pattern.factory.abstractfactory.product.IPad1;
import org.xuyuji.pattern.factory.abstractfactory.product.IPhone;
import org.xuyuji.pattern.factory.abstractfactory.product.IPhone1;

/**
 * 富士康代工厂生产1代产品
 * 
 * @author xuyuji
 *
 */
public class FoxconnFactory implements Factory {

	@Override
	public IMac getIMac() {
		return new IMac1();
	}

	@Override
	public IPad getIPad() {
		return new IPad1();
	}

	@Override
	public IPhone getIPhone() {
		return new IPhone1();
	}

}
