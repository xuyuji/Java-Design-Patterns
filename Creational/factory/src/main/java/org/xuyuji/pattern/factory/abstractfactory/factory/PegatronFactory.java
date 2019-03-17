package org.xuyuji.pattern.factory.abstractfactory.factory;

import org.xuyuji.pattern.factory.abstractfactory.product.IMac;
import org.xuyuji.pattern.factory.abstractfactory.product.IMac2;
import org.xuyuji.pattern.factory.abstractfactory.product.IPad;
import org.xuyuji.pattern.factory.abstractfactory.product.IPad2;
import org.xuyuji.pattern.factory.abstractfactory.product.IPhone;
import org.xuyuji.pattern.factory.abstractfactory.product.IPhone2;

/**
 * 和硕代工厂生产2代产品
 * 
 * @author xuyuji
 *
 */
public class PegatronFactory implements Factory {

	@Override
	public IMac getIMac() {
		return new IMac2();
	}

	@Override
	public IPad getIPad() {
		return new IPad2();
	}

	@Override
	public IPhone getIPhone() {
		return new IPhone2();
	}

}
