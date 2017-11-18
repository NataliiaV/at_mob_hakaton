package com.epam.at.pageobjects;

import com.epam.at.utils.driver.DriverRepository;
import elements.Button;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogPage {

    @FindBy(id = "bsk_image_first")
    private WebElement firstImage;

    @FindBy(id = "bsk_image_second")
    private WebElement secondImage;

    @FindBy(id = "bsk_image_third")
    private WebElement thirdImage;

    @FindBy(id = "bsk_image_fourth")
    private WebElement fourthImage;

    public Button getFirstImage() {
        return new Button(firstImage);
    }

    public Button getSecondImage() {
        return new Button(secondImage);
    }

    public Button getThirdImage() {
        return new Button(thirdImage);
    }

    public Button getFourthImage() {
        return new Button(fourthImage);
    }

    public CatalogPage() {
        PageFactory.initElements(DriverRepository.getAndroidDriver(), this);
    }
}
