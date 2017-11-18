package com.epam.at.tests;

import com.epam.at.businesslogic.BaseLogic;
import com.epam.at.utils.PhonePerfCharacteristicsUtil;
import com.epam.at.utils.driver.DriverRepository;
import org.apache.log4j.Logger;
import org.testng.annotations.*;

public class TestBase {
    protected final Logger LOG = Logger.getLogger(TestBase.class);
    private PhonePerfCharacteristicsUtil perfInfo = new PhonePerfCharacteristicsUtil();

    @BeforeSuite
    public void logPerfInfoBeforeAllTest() {
        perfInfo.logAllInfo(LOG);
    }

    @BeforeMethod
    public void startApp() {
        DriverRepository.getAndroidDriver().launchApp();
    }

    @AfterMethod
    public void tearDown() {
        DriverRepository.getAndroidDriver().closeApp();
    }

    @AfterSuite
    public void logPerfInfoAfterAllTest() {
        perfInfo.logAllInfo(LOG);
        DriverRepository.getAndroidDriver().quit();
    }
}