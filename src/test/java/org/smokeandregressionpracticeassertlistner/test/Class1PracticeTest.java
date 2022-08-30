package org.smokeandregressionpracticeassertlistner.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.genericutility.BaseClass;

public class Class1PracticeTest extends BaseClass{
	@Test (groups = "ST")
	public void test1() throws InterruptedException
	{
		//SoftAssert sa = new SoftAssert();
		//sa.assertEquals("A", "B");
		System.out.println("Smoke Testing");
		Thread.sleep(2000);
		//sa.assertAll();
	}
	
	@Test (groups = "RT")
	public void test2() throws InterruptedException
	{
		//Assert.assertEquals("A","B");
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
