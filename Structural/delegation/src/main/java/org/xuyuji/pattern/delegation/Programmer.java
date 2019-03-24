package org.xuyuji.pattern.delegation;

public class Programmer implements Employee {

	@Override
	public void wrok(String command) {
		System.out.println("开始工作:" + command);
	}

}
