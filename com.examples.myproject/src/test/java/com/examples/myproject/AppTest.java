package com.examples.myproject;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	private App app;

	@Before
	public void setup() {
		app = new App();
	}

	@Test
	public void testSayHello() {
		assertEquals("Hello", app.sayHello());
	}

	@Test
	public void testSayHelloWithName() {
		assertEquals("Hello World", app.sayHello("World"));
	}
}