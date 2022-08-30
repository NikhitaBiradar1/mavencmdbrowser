package com.genericutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImp implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		
		JavaUtility jLib = new JavaUtility();
		String dateTime = jLib.getSystemDateInISTWithTime();
		
		String testcaseName = result.getMethod().getMethodName();
		EventFiringWebDriver event = new EventFiringWebDriver(BaseClass.sdriver);
		File src = event.getScreenshotAs(OutputType.FILE);
		File dst = new File("./Screenshots/"+testcaseName+""+dateTime+".png");
		try {
			FileHandler.copy(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
