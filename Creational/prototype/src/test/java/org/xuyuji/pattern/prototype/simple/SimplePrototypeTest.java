package org.xuyuji.pattern.prototype.simple;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;
import org.xuyuji.pattern.prototype.Tool;

public class SimplePrototypeTest {

	@Test
	public void test() {
		Person man = new Person();
		man.setAge(18);
		man.setName("Lily");
		man.setTool(new Tool("hammer"));
		Person cloneMan = (Person) man.clone();

		assertNotSame(man, cloneMan);
		assertEquals(man.getAge(), cloneMan.getAge());
		assertEquals(man.getName(), cloneMan.getName());
		assertEquals(man.getTool(), cloneMan.getTool());
	}
}
