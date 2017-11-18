package com.epam.at.tests;

import com.epam.at.assertion.VideoAssertions;
import com.epam.at.businesslogic.CatalogPageBL;
import com.epam.at.businesslogic.LoginPageBL;
import com.epam.at.businesslogic.ProductPageBL;
import com.epam.at.businesslogic.VideoPageBL;
import com.epam.at.utils.ImageUtil;
import com.epam.at.utils.driver.DriverRepository;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

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

    @Test //contains image comparison
    public void screenChangesDuringVideo() throws IOException, InterruptedException {

        login.loginApp(EMAIL_REGISTERED, PASSWORD_REGISTERED);
        catalog.goToProduct();
        productPageBL.playVideo();

        BufferedImage img1 = ImageIO.read(DriverRepository.getScreenshotFile());
        Thread.sleep(10000);
        BufferedImage img2 = ImageIO.read(DriverRepository.getScreenshotFile());
        Assert.assertTrue(ImageUtil.getDifference(img1, img2) > 10);

    }
}