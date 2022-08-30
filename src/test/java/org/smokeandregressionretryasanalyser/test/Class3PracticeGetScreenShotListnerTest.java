package org.smokeandregressionretryasanalyser.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.genericutility.BaseClass;


@Listeners (com.genericutility.ListnerImp.class)
public class Class3PracticeGetScreenShotListnerTest extends BaseClass{
	@Test (groups = "ST")
	public void test1() throws InterruptedException
	{
		//SoftAssert sa = new SoftAssert();
		//sa.assertEquals(true, false);
		System.out.println("Smoke Testing");
		Thread.sleep(2000);
		//sa.assertAll();
	}
	
	@Test (groups = "RT")
	public void test2() throws InterruptedException
	{
		System.out.println("Regression Testing");
		Thread.sleep(2000);
	}
	
	@Test (groups = "RT")
	public void test3() throws InterruptedException
	{
		System.out.println("Regression Testing");
		Thread.sleep(2000);
	}

}
