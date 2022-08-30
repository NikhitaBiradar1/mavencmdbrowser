package org.smokeandregressionpractice.test;

import org.testng.annotations.Test;

import com.genericutility.BaseClass;
import com.genericutility.BaseClassCrossBrowser;

public class Class2PracticeTest extends BaseClass {
	@Test (groups = "ST")
	public void test1() throws InterruptedException
	{
		System.out.println("Smoke Testing");
		Thread.sleep(8000);
	}
	
	@Test (groups = "RT")
	public void test2() throws InterruptedException
	{
		System.out.println("Regression Testing");
		Thread.sleep(10000);
	}
	
	@Test (groups = "RT")
	public void test3() throws InterruptedException
	{
		System.out.println("Regression Testing");
		Thread.sleep(12000);
	}
}
