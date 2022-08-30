package org.smokeandregressionpractice2.test;

import org.testng.annotations.Test;

import com.genericutility.BaseClass;
import com.genericutility.BaseClassCrossBrowser;

public class Class3PracticeTest extends BaseClass{
	@Test (groups = "ST")
	public void test1() throws InterruptedException
	{
		System.out.println("Smoke Testing");
		Thread.sleep(50000);
	}
	
	@Test (groups = "RT")
	public void test2() throws InterruptedException
	{
		System.out.println("Regression Testing");
		Thread.sleep(52000);
	}
	
	@Test (groups = "RT")
	public void test3() throws InterruptedException
	{
		System.out.println("Regression Testing");
		Thread.sleep(54000);
	}

}
