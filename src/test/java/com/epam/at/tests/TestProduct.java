package com.epam.at.tests;

import com.epam.at.assertion.ProductAssertion;
import com.epam.at.businesslogic.LoginPageBL;
import com.epam.at.businesslogic.ProductPageBL;
import org.testng.annotations.Test;

import static com.epam.at.utils.ConstantUtil.*;

public class TestProduct extends TestBase {

    private LoginPageBL login = new LoginPageBL();
    private ProductPageBL productPageBL = new ProductPageBL();

    @Test
    public void addProductToCart() {
        productPageBL = login.loginApp(EMAIL_REGISTERED, PASSWORD_REGISTERED)
                .goToProduct()
                .addProduct(MAX_PRODUCT_NUMBER);

        ProductAssertion.verifyMaxProductNumber(productPageBL);
    }

    @Test
    public void removeProductFromCart() {
        productPageBL = login.loginApp(EMAIL_REGISTERED, PASSWORD_REGISTERED)
                .goToProduct()
                .removeProduct(MIN_PRODUCT_NUMBER);

        ProductAssertion.verifyMinProductNumber(productPageBL);
    }

    @Test
    public void payProduct() {
        login.loginApp(EMAIL_REGISTERED, PASSWORD_REGISTERED)
                .goToProduct()
                .payProduct();
    }
}
