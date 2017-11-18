package com.epam.at.tests;

import com.epam.at.businesslogic.CatalogPageBL;
import com.epam.at.businesslogic.LoginPageBL;
import com.epam.at.businesslogic.VideoPageBL;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.at.utils.driver.ConstantUtils.EMAIL_REGISTERED;
import static com.epam.at.utils.driver.ConstantUtils.PASSWORD_REGISTERED;

public class VideoTest extends TestBase {
    private LoginPageBL login = new LoginPageBL();
    private CatalogPageBL catalog = new CatalogPageBL();
    private VideoPageBL video = new VideoPageBL();

    @Test
    public void videoIsPlayed() {
        login.loginApp(EMAIL_REGISTERED, PASSWORD_REGISTERED);
        catalog.goToProduct();
        video.clickOnScringDuringVideo();
        Assert.assertTrue(video.videoIsPlayed(), "Video should play when click start video!");
    }
}