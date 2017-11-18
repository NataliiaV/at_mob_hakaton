package com.epam.at.tests;

import com.epam.at.pageobjects.LoginPage;
import com.epam.at.utils.driver.ConstantUtils;
import com.epam.at.utils.driver.DriverRepository;
import org.junit.Test;
import org.testng.annotations.AfterTest;

public class TestMock {
    @Test
    public void startApp() {
        DriverRepository.getAndroidDriver();

        LoginPage loginPage = new LoginPage();
        loginPage.getInputEmail().sendKeys(ConstantUtils.email);

        loginPage.getLoginButton().click();
    }

    @AfterTest
    public void tearDown() {
        DriverRepository.getAndroidDriver().quit();
    }
}