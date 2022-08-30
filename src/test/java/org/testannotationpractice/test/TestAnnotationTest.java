package org.testannotationpractice.test;

import org.testng.annotations.Test;

import com.genericutility.BaseClassCrossBrowser;

public class TestAnnotationTest extends BaseClassCrossBrowser {
	String name = "Hello";
	//The value will not be reinitialized to global value after every @Test
	@Test
	public void test1()
	{
		System.out.println(name);
		name = "Hi";
		System.out.println(name);
	}
	
	@Test
	public void test2()
	{
		System.out.println(name);
	}

}
