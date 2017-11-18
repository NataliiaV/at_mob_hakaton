package com.epam.at.businesslogic;

import com.epam.at.pageobjects.ProductPage;

public class ProductPageBL extends BaseLogic {

    private ProductPage productPage = new ProductPage();

    public ProductPageBL addProduct(int productNumber) {
        while (productNumber != 0) {
            productPage.getButtonCartPlus().click();
            productNumber--;
        }

        return this;
    }

    public ProductPageBL removeProduct(int productNumber) {
        while (productNumber != 0) {
            productPage.getButtonCartMinus().click();
            productNumber--;
        }

        return this;
    }

    public int getProductNumber() {
        String productNumber = productPage.getCartQuantity().getText();
        return Integer.parseInt(productNumber);
    }

    public ProductPageBL playVideo() {
        productPage.getButtonStartMovie().click();

        return this;
    }
    public String getErrorMessage() {
        return productPage.getErrorMessage().getText();
    }
}
