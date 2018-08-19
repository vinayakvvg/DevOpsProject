package com.nissan.devops;

//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class AppTest {
	
	private App add;
	
	@Before
	public void setup() {
		add = new App();
	}
	
	@Test
	public void bothIntegerNumbers() {
		Assert.assertEquals("9", add.calculateSum("2", "7")) ;
	}
	
	
	
}
