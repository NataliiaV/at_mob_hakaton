package com.epam.at.tests;

import com.epam.at.businesslogic.LoginPageBL;
import com.epam.at.businesslogic.ProductPageBL;
import org.testng.annotations.Test;

public class TestProductLike extends TestBase {

    private LoginPageBL login = new LoginPageBL();
    private ProductPageBL product = new ProductPageBL();

    @Test
    public void addLikeToProduct() {
        ProductPageBL addLikeProduct = login.registerApp()
                .goToProduct()
                .addLike(10);
    }
}
