package org.smokeandregressionpracticeCrossBrowser.test;

import org.testng.annotations.Test;

import com.genericutility.BaseClassCrossBrowser;

public class Class1PracticeTest extends BaseClassCrossBrowser{
	@Test (groups = "ST")
	public void test1() throws InterruptedException
	{
		System.out.println("Smoke Testing");
		Thread.sleep(2000);
	}
	
	@Test (groups = "RT")
	public void test2() throws InterruptedException
	{
		System.out.println("Regression Testing");
		Thread.sleep(4000);
	}
	
	@Test (groups = "RT")
	public void test3() throws InterruptedException
	{
		System.out.println("Regression Testing");
		Thread.sleep(6000);
	}

}
