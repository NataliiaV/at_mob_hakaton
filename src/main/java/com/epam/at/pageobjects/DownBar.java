package com.epam.at.pageobjects;

import com.epam.at.utils.driver.DriverRepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownBar {

    @FindBy(id = "navigationBarBackground")
    private WebElement squareBar;

    @FindBy(id = "workspace")
    private WebElement sircleBar;

    public DownBar() {
        PageFactory.initElements(DriverRepository.getAndroidDriver(), this);
    }
}
