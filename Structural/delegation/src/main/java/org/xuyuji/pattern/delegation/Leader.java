package org.xuyuji.pattern.delegation;

import java.util.HashMap;
import java.util.Map;

public class Leader {

	private Map<String, Employee> employees;

	public Leader() {
		employees = new HashMap<>();
		employees.put("code", new Programmer());
		employees.put("test", new TestEngineer());
	}

	public void dispatchTask(String command) {
		employees.get(command).wrok(command);
	}
}
