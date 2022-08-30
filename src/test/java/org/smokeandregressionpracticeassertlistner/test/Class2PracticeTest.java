package org.smokeandregressionpracticeassertlistner.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.genericutility.BaseClass;

public class Class2PracticeTest extends BaseClass {
	@Test (groups = "ST")
	public void test1() throws InterruptedException
	{
		//SoftAssert sa = new SoftAssert();
		//sa.assertEquals("A", "B");
		System.out.println("Smoke Testing");
		Thread.sleep(8000);
		//sa.assertAll();
		//if we don't give assertAll() 
		//then the test case will pass even it fails
		//If we give assertAll() inbetween 
		//then next steps will not execute --> 
		//All steps will execute till asserAll() and fails the test case if the actual and expected result are different
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
