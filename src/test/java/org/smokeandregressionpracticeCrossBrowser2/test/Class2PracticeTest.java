package org.smokeandregressionpracticeCrossBrowser2.test;

import org.testng.annotations.Test;

import com.genericutility.BaseClassCrossBrowser;

public class Class2PracticeTest extends BaseClassCrossBrowser{
	@Test (groups = "ST")
	public void test1() throws InterruptedException
	{
		System.out.println("Smoke Testing");
		Thread.sleep(44000);
	}
	
	@Test (groups = "RT")
	public void test2() throws InterruptedException
	{
		System.out.println("Regression Testing");
		Thread.sleep(46000);
	}
	
	@Test (groups = "RT")
	public void test3() throws InterruptedException
	{
		System.out.println("Regression Testing");
		Thread.sleep(48000);
	}
}
