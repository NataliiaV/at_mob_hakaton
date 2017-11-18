package com.epam.at.pageobjects;

import com.epam.at.utils.driver.DriverRepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Oleg_Shchur on 11/18/2017.
 */
public class LoginPage {
    @FindBy(id = "email")
    private WebElement inputEmail;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(id = "email_sign_in_button")
    private WebElement loginButton;

    public WebElement getInputEmail(){
        return inputEmail;
    }

    public WebElement getInputPassword(){
        return inputPassword;
    }

    public WebElement getLoginButton(){
        return loginButton;
    }

    public LoginPage() {
        PageFactory.initElements(DriverRepository.getAndroidDriver(), this);
    }

}
