package org.xuyuji.pattern.factory.abstractfactory.factory;

import org.xuyuji.pattern.factory.abstractfactory.product.IMac;
import org.xuyuji.pattern.factory.abstractfactory.product.IPad;
import org.xuyuji.pattern.factory.abstractfactory.product.IPhone;

public interface Factory {

	public IMac getIMac();

	public IPad getIPad();

	public IPhone getIPhone();
}
