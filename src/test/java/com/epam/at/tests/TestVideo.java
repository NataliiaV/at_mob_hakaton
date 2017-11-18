package com.epam.at.tests;

import com.epam.at.assertion.VideoAssertions;
import com.epam.at.businesslogic.CatalogPageBL;
import com.epam.at.businesslogic.LoginPageBL;
import com.epam.at.businesslogic.ProductPageBL;
import com.epam.at.businesslogic.VideoPageBL;
import org.testng.annotations.Test;

import static com.epam.at.utils.ConstantUtil.EMAIL_REGISTERED;
import static com.epam.at.utils.ConstantUtil.PASSWORD_REGISTERED;

public class TestVideo extends TestBase {
    private LoginPageBL login = new LoginPageBL();
    private CatalogPageBL catalog = new CatalogPageBL();
    private VideoPageBL video = new VideoPageBL();
    private ProductPageBL productPageBL = new ProductPageBL();

    @Test
    public void videoIsPlayed() {
        login.loginApp(EMAIL_REGISTERED, PASSWORD_REGISTERED);
        catalog.goToProduct();
        productPageBL.playVideo();
        VideoAssertions.assertVieoIsPlayed(video);
    }
}