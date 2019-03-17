package org.xuyuji.pattern.prototype.deep;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;
import org.xuyuji.pattern.prototype.Tool;

public class DeepPrototypeTest {

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
		assertNotSame(man.getTool(), cloneMan.getTool());
	}
}
