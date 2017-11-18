package com.epam.at.tests;

import com.epam.at.utils.driver.DriverRepository;
import org.junit.Test;
import org.testng.annotations.AfterTest;

public class TestMock {
    @Test
    public void startApp() {
        DriverRepository.getAndroidDriver();
    }

    @AfterTest
    public void tearDown() {
        DriverRepository.getAndroidDriver().quit();
    }
}