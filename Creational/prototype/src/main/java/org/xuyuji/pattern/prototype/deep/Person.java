package org.xuyuji.pattern.prototype.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.xuyuji.pattern.prototype.Prototype;
import org.xuyuji.pattern.prototype.Tool;

public class Person implements Prototype, Serializable {

	private static final long serialVersionUID = -9103624257776785508L;

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
		return this.deepClone();
	}

	private Prototype deepClone() {

		try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(bos);) {

			oos.writeObject(this);
			try (ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
					ObjectInputStream ois = new ObjectInputStream(bis)) {
				return (Person) ois.readObject();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
