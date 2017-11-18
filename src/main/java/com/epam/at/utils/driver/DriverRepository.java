package com.epam.at.utils.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.log4j.Logger;

import java.net.MalformedURLException;

public class DriverRepository {
    private static volatile AndroidDriver<AndroidElement> driver;
    private static final Logger LOG = Logger.getLogger(DriverRepository.class);

    private DriverRepository() {
    }

    public synchronized static AndroidDriver<AndroidElement> getAndroidDriver() {
        synchronized (DriverRepository.class) {
            if (driver == null) {
                try {
                    driver = DriversEnum.valueOf("APPIUM_ANDROID").getDriver();
                } catch (MalformedURLException e) {
                    LOG.error(e.toString());
                }
            }
            return driver;
        }
    }
}