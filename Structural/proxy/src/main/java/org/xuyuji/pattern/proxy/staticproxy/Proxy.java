package org.xuyuji.pattern.proxy.staticproxy;

public class Proxy implements Subject {

	private Subject target;

	public Proxy(Subject target) {
		this.target = target;
	}

	@Override
	public void request() {
		before();
		target.request();
		after();
	}

	private void before() {
		System.out.println("Proxy:before");
	}

	private void after() {
		System.out.println("Proxy:after");
	}

}
