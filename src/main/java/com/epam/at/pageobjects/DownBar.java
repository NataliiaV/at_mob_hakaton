package com.epam.at.pageobjects;

import com.epam.at.utils.driver.DriverRepository;
import elements.Button;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownBar {

    @FindBy(id = "navigationBarBackground")
    private WebElement background;

    @FindBy(id = "workspace")
    private WebElement workspace;

    public Button getBackground() {
        return new Button(background);
    }

    public Button getWorkspace() {
        return new Button(workspace);
    }

    public DownBar() {
        PageFactory.initElements(DriverRepository.getAndroidDriver(), this);
    }
}
