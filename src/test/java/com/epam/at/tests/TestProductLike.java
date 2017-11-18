package com.epam.at.tests;

import com.epam.at.assertion.ProductAssertion;
import com.epam.at.businesslogic.LoginPageBL;
import com.epam.at.businesslogic.ProductPageBL;
import org.testng.annotations.Test;

import static com.epam.at.utils.ConstantUtil.*;

public class TestProductLike extends TestBase {

    private LoginPageBL login = new LoginPageBL();

    @Test
    public void addProductToCart() {
        ProductPageBL addLikeProduct = login.loginApp(EMAIL_REGISTERED, PASSWORD_REGISTERED)
                .goToProduct()
                .addProduct(MAX_PRODUCT_NUMBER);

        ProductAssertion.verifyMaxProductNumber(addLikeProduct);
    }

    @Test
    public void removeProductFormCart() {
        ProductPageBL removeLikeProduct = login.loginApp(EMAIL_REGISTERED, PASSWORD_REGISTERED)
                .goToProduct()
                .removeProduct(MIN_PRODUCT_NUMBER);

        ProductAssertion.verifyMinProductNumber(removeLikeProduct);
    }
}
