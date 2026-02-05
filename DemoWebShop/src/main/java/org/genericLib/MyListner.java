package org.genericLib;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListner extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log("[Testcases "+result.getName()+" has started]", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("[Testcases "+result.getName()+" has successefully executed]", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("[Testcases "+result.getName()+" has a failed and taken a Screen Shot", true);
		String ldt = LocalDateTime.now().toString();
		String dateTime = ldt.replaceAll(":", "-");
		 
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file= ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Public\\Pictures\\SS "+result.getName()+dateTime+".png");
		try {
			org.openqa.selenium.io.FileHandler.copy(file, dest);
		} catch (IOException e) {

			e.printStackTrace();
		}
		}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("[Testcases"+result.getName()+"has skipped]", true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("[Testcases"+result.getName()+"has failed with some success percentage]", true);

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("[Testcases"+result.getName()+"has failed due to some timeouts]", true);

	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("[Testcases"+context.getName()+"has started]", true);

	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("[Testcases"+context.getName()+"has finished]", true);

	}
	

}
