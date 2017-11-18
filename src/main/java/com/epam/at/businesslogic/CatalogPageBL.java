package com.epam.at.businesslogic;

import com.epam.at.pageobjects.CatalogPage;

public class CatalogPageBL {

    private CatalogPage catalogPage = new CatalogPage();

    public ProductPageBL goToProduct() {
        catalogPage.getSecondImage().waitForVisibility(2000);
        catalogPage.getSecondImage().click();

        return new ProductPageBL();
    }
}
