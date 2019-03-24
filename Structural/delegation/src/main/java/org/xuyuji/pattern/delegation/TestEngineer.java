package org.xuyuji.pattern.delegation;

public class TestEngineer implements Employee {

	@Override
	public void wrok(String command) {
		System.out.println("开始工作:" + command);
	}

}
