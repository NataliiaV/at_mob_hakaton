package com.epam.at.tests;

import com.epam.at.businesslogic.LoginPageBL;
import com.epam.at.businesslogic.ProductPageBL;
import com.epam.at.utils.ConstantUtil;
import junit.framework.Assert;
import org.testng.annotations.Test;

import static com.epam.at.utils.ConstantUtil.EMAIL_REGISTERED;
import static com.epam.at.utils.ConstantUtil.PASSWORD_REGISTERED;

public class TestProductLike extends TestBase {

    private LoginPageBL login = new LoginPageBL();
    private ProductPageBL product = new ProductPageBL();

    @Test
    public void addLikeToProduct() {
        ProductPageBL addLikeProduct = login.loginApp(EMAIL_REGISTERED, PASSWORD_REGISTERED)
                .goToProduct()
                .addLike(ConstantUtil.MAX_LIKES_NUMBER);

        Assert.assertEquals(ConstantUtil.MAX_LIKES_NUMBER, addLikeProduct.getProductNumber());
    }
}
