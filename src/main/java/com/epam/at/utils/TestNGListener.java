package com.epam.at.utils;

import com.epam.at.utils.driver.DriverRepository;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class TestNGListener implements ITestListener {
	private static final Logger LOG = Logger.getLogger(TestNGListener.class);

	public void onFinish(ITestContext result) {
		LOG.info(PhonePerfCharacteristicsUtil.getMemoryInfoMap());
	}

	public void onStart(ITestContext result) {
		LOG.info(PhonePerfCharacteristicsUtil.getMemoryInfoMap());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailure(ITestResult result) {
		LOG.error(String.format("Test failure. Method name : %s", result.getName()));
		LOG.error("Test failure. Error : " + result.getThrowable().getMessage());

		TakesScreenshot takesScreenshot = DriverRepository.getAndroidDriver();
		File screen = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String screenPath = "target/surefire-reports/screens/screen" + System.currentTimeMillis() + ".png";
		try {
		    File newFile =  new File(screenPath);
			FileUtils.copyFile(screen, newFile);
			LOG.error("Screenshot path:" + newFile.getAbsolutePath());
		} catch (IOException e) {
			LOG.error("Error while saving screenshot.");
		}
	}

	public void onTestSkipped(ITestResult result) {
		LOG.debug("Test skipped. Method name : " + result.getName());
	}

	public void onTestStart(ITestResult result) {
		LOG.debug("Test started. Test name : " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		LOG.debug("Test succeed. Method name : " + result.getName());
	}

}