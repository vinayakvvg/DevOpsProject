package com.nissan.devops;

import org.junit.*;

public class AppTest {
	private App add;
	
	@Before
	public void setup() {
		add = new App();
	}
	
	@Test
	public void bothIntegerNumbers() {
		Assert.assertEquals("5", add.calculateSum("3", "2")) ;
	}
	
	
}