package org.xuyuji.pattern.prototype;

import java.io.Serializable;

public class Tool implements Serializable {

	private static final long serialVersionUID = -2218465715694713405L;

	private String name;

	public Tool(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
