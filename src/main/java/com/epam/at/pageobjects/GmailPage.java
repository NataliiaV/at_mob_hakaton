package com.epam.at.pageobjects;

import elements.Email;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailPage {

    @FindBy(xpath = "contains(@contentDescription, 'Take care of this number:')")
    WebElement emailWithCode;

    public Email getEmailWithCode(){
        return new Email(emailWithCode);
    }
}
