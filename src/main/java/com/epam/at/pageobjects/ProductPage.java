package com.epam.at.pageobjects;

import com.epam.at.utils.driver.DriverRepository;
import elements.Button;
import elements.Input;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    @FindBy(id = "cartBtn")
    private WebElement buttonCart;

    @FindBy(id = "cart_product")
    private WebElement productImage;

    @FindBy(id = "cartMinus")
    private WebElement cartMinus;

    @FindBy(id = "cartPlus")
    private WebElement cartPlus;

    @FindBy(id = "cartQty")
    private WebElement cartQuantity;

    @FindBy(id = "payNow")
    private WebElement payNow;

    @FindBy(id = "contactUs")
    private WebElement contactUs;

    @FindBy(id = "error_count")
    private WebElement errorMessage;

    public Button getButtonStartMovie() {
        return new Button(buttonCart);
    }

    public Button getProductImage() {
        return new Button(productImage);
    }

    public Button getButtonCartMinus() {
        return new Button(cartMinus);
    }

    public Button getButtonCartPlus() {
        return new Button(cartPlus);
    }

    public Input getCartQuantity() {
        return new Input(cartQuantity);
    }

    public Button getButtonPayNow() {
        return new Button(payNow);
    }

    public Button getContactUs() {
        return new Button(contactUs);
    }

    public Input getErrorMessage() { return new Input(errorMessage);}

    public ProductPage() {
        PageFactory.initElements(DriverRepository.getAndroidDriver(), this);
    }
}
