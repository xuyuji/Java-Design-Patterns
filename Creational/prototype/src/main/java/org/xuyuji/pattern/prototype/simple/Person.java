package org.xuyuji.pattern.prototype.simple;

import org.xuyuji.pattern.prototype.Prototype;
import org.xuyuji.pattern.prototype.Tool;

public class Person implements Prototype {

	private int age;
	private String name;
	private Tool tool;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tool getTool() {
		return tool;
	}

	public void setTool(Tool tool) {
		this.tool = tool;
	}

	@Override
	public Prototype clone() {
		Person copy = new Person();
		copy.setAge(this.getAge());
		copy.setName(this.getName());
		copy.setTool(this.getTool());
		return copy;
	}
}
