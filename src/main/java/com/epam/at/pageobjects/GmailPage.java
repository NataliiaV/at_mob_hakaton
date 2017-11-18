package com.epam.at.pageobjects;

import com.epam.at.utils.driver.DriverRepository;
import elements.Email;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPage {

    @FindBy(xpath = "contains(@contentDescription, 'Take care of this number:')")
    WebElement emailWithCode;

    public Email getEmailWithCode(){
        return new Email(emailWithCode);
    }

    public GmailPage() {
        PageFactory.initElements(DriverRepository.getAndroidDriver(), this);
    }
}
