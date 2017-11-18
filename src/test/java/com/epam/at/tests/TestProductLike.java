package com.epam.at.tests;

import com.epam.at.assertion.ProductLikeAssertion;
import com.epam.at.businesslogic.LoginPageBL;
import com.epam.at.businesslogic.ProductPageBL;
import org.testng.annotations.Test;

import static com.epam.at.utils.ConstantUtil.*;

public class TestProductLike extends TestBase {

    private LoginPageBL login = new LoginPageBL();

    @Test
    public void addLikeToProduct() {
        ProductPageBL addLikeProduct = login.loginApp(EMAIL_REGISTERED, PASSWORD_REGISTERED)
                .goToProduct()
                .addLike(MAX_LIKES_NUMBER);

        ProductLikeAssertion.verifyMaxLikeNumber(addLikeProduct);
    }

    @Test
    public void removeLikeFromProduct() {
        ProductPageBL removeLikeProduct = login.loginApp(EMAIL_REGISTERED, PASSWORD_REGISTERED)
                .goToProduct()
                .removeLike(MIN_LIKES_NUMBER);

        ProductLikeAssertion.verifyMinLikeNumber(removeLikeProduct);
    }
}
