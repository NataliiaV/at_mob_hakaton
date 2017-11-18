package com.epam.at.assertion;

import com.epam.at.businesslogic.ProductPageBL;
import junit.framework.Assert;

import static com.epam.at.utils.ConstantUtil.*;

/**
 * Created by Oleg_Shchur on 11/18/2017.
 */
public class ProductAssertion {

    public static void verifyMaxProductNumber(ProductPageBL productPageBL) {
        Assert.assertEquals(MAX_PRODUCT_NUMBER, productPageBL.getProductNumber());
        Assert.assertEquals(MAX_PRODUCT_ERROR_MESSAGE, productPageBL.getErrorMessage());
    }

    public static void verifyMinProductNumber(ProductPageBL productPageBL) {
        Assert.assertEquals(MIN_PRODUCT_NUMBER, productPageBL.getProductNumber());
        Assert.assertEquals(MIN_PRODUCT_ERROR_MESSAGE, productPageBL.getErrorMessage());
    }
}
