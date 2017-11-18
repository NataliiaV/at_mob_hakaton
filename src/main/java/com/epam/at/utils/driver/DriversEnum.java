package com.epam.at.utils.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public enum DriversEnum {
    APPIUM_ANDROID {
        @Override
        protected AndroidDriver<AndroidElement> getDriver() throws MalformedURLException {
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability("reportDirectory", "reports");
            dc.setCapability("reportFormat", "xml");
            dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            dc.setCapability(MobileCapabilityType.APP, new File(RELATIVE_APP_PATH).getAbsolutePath());
            dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.hackaton.epam.tahackaton");
            dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
            driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            LOG.info("Driver created.");

            return driver;
        }
    };

    private static AndroidDriver<AndroidElement> driver;
    private static final Logger LOG = Logger.getLogger(DriversEnum.class);
    private static final String RELATIVE_APP_PATH = "src/main/resources/app-release.apk";

    protected abstract AndroidDriver<AndroidElement> getDriver() throws MalformedURLException;
}