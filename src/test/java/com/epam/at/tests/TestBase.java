package com.epam.at.tests;

import com.epam.at.utils.PhonePerfCharacteristicsUtil;
import com.epam.at.utils.driver.DriverRepository;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    protected final Logger LOG = Logger.getLogger(TestBase.class);
    private PhonePerfCharacteristicsUtil perfInfo = new PhonePerfCharacteristicsUtil();

    @BeforeSuite
    public void logPerfInfoBeforeAllTest() {
        perfInfo.logAllInfo(LOG);
    }

    @BeforeClass
    public void startApp() {
        DriverRepository.getAndroidDriver();
    }

    @AfterClass
    public void tearDown() {
        if (DriverRepository.getAndroidDriver() != null)
            DriverRepository.getAndroidDriver().quit();
    }

    @AfterSuite
    public void logPerfInfoAfterAllTest() {
        perfInfo.logAllInfo(LOG);
    }
}