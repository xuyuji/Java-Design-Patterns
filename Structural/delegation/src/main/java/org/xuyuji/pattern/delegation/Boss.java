package org.xuyuji.pattern.delegation;

public class Boss {

	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.dispatchTask("code");
		leader.dispatchTask("test");
	}
}
