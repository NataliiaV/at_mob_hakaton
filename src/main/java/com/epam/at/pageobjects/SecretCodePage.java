package com.epam.at.pageobjects;

import com.epam.at.utils.driver.DriverRepository;
import elements.Button;
import elements.Input;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Oleg_Shchur on 11/18/2017.
 */
public class SecretCodePage {

    @FindBy(id = "secret")
    private WebElement inputSecretCode;

    @FindBy(id = "secretBrn")
    private WebElement buttonSectetCode;

    public Input getInputSecretCode(){
        return new Input(inputSecretCode);
    }

    public Button getButtonSectetCode(){
        return new Button(buttonSectetCode);
    }

    public SecretCodePage() {
        PageFactory.initElements(DriverRepository.getAndroidDriver(), this);
    }
}
