package com.epam.at.pageobjects;

import com.epam.at.utils.driver.DriverRepository;
import elements.Input;
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

    public Input getFirstImage(){
        return new Input(firstImage);
    }

    public Input getSecondImage(){
        return new Input(secondImage);
    }

    public Input getThirdImage(){
        return new Input(thirdImage);
    }

    public Input getFourthImage(){
        return new Input(fourthImage);
    }

    public CatalogPage() {
        PageFactory.initElements(DriverRepository.getAndroidDriver(), this);
    }
}
