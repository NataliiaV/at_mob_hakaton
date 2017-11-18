package com.epam.at.tests;

import com.epam.at.utils.driver.DriverRepository;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    @BeforeClass
    public void startApp() {
        DriverRepository.getAndroidDriver();
    }

    @AfterClass
    public void tearDown() {
        if (DriverRepository.getAndroidDriver() != null)
            DriverRepository.getAndroidDriver().quit();
    }
}