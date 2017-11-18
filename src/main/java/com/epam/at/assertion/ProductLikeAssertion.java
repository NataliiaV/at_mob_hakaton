package com.epam.at.assertion;

import com.epam.at.businesslogic.ProductPageBL;
import junit.framework.Assert;

import static com.epam.at.utils.ConstantUtil.*;

/**
 * Created by Oleg_Shchur on 11/18/2017.
 */
public class ProductLikeAssertion {

    public static void verifyMaxLikeNumber(ProductPageBL productPageBL) {
        Assert.assertEquals(MAX_LIKES_NUMBER, productPageBL.getProductNumber());
        Assert.assertEquals(MAX_LIKES_ERROR_MESSAGE, productPageBL.getErrorMessage());
    }

    public static void verifyMinLikeNumber(ProductPageBL productPageBL) {
        Assert.assertEquals(MIN_LIKES_NUMBER, productPageBL.getProductNumber());
        Assert.assertEquals(MIN_LIKES_ERROR_MESSAGE, productPageBL.getErrorMessage());
    }
}
