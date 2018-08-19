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
	
	@Test
	public void bothFloatNumbers() {
		Assert.assertEquals("6.7", add.calculateSum("1.3", "5.4")) ;
	}
	
	@Test
	public void integerAndFloatNumbers() {
		Assert.assertEquals("81.55", add.calculateSum("72", "9.55")) ;
	}
	
	@Test
	public void floatAndIntegerNumbers() {
		Assert.assertEquals("21.279", add.calculateSum("16.279", "5")) ;
	}
	
	@Test
	public void firstNumberMissing() {
		Assert.assertEquals("Please enter number 1", add.calculateSum("", "9")) ;
	}
	
	@Test
	public void secondNumberMissing() {
		Assert.assertEquals("Please enter number 2", add.calculateSum("27", "")) ;
	}
	
	@Test
	public void stringInput() {
		Assert.assertEquals("Please enter integer or floating decimal values only", add.calculateSum("vinayak", "123.45")) ;
	}
	
	@Test
	public void mixedInput() {
		Assert.assertEquals("Please enter integer or floating decimal values only", add.calculateSum("789.564", "27vinayak")) ;
	}
}