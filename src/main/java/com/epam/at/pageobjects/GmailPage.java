package com.epam.at.pageobjects;

import com.epam.at.utils.driver.DriverRepository;
import elements.Button;
import elements.CodeEmail;
import elements.Email;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPage {

    @FindBy(xpath = "contains(@contentDescription, 'Take care of this number:')")
    WebElement codeEmail;

    @FindBy(xpath = "contains(@contentDescription, 'You bought new')")
    WebElement confirmationEmail;

    @FindBy(xpath = "//*[@text='Gmail']")
    WebElement application;

    public CodeEmail getCodeEmail() {
        return new CodeEmail(codeEmail);
    }

    public Email getConfirmationEmail(){
        return new Email(confirmationEmail);
    }

    public Button getApplication(){
        return new Button(application);
    }

    public GmailPage() {
        PageFactory.initElements(DriverRepository.getAndroidDriver(), this);
    }
}
