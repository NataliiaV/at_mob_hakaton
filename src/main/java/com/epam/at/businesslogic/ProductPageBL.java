package com.epam.at.businesslogic;

import com.epam.at.pageobjects.ProductPage;

public class ProductPageBL extends BaseLogic {

    private ProductPage productPage = new ProductPage();

    public ProductPageBL addLike(int likesNumber) {
        while (likesNumber != 0) {
            productPage.getButtonCartPlus().click();
            likesNumber--;
        }

        return this;
    }

    public ProductPageBL removeLike(int likesNumber) {
        while (likesNumber != 0) {
            productPage.getButtonCartMinus().click();
            likesNumber--;
        }

        return this;
    }

    public int getProductNumber() {
        String productNumber = productPage.getCartQuantity().getText();
        return Integer.parseInt(productNumber);
    }
}
