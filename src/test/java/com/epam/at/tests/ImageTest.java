package com.epam.at.tests;

import com.epam.at.utils.ImageComparator;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageTest extends TestBase{

    @Test
    public void canCompare() throws IOException {
        BufferedImage img1 = ImageIO.read(new File("src/test/resources/Images/image1.jpg"));
        BufferedImage img2 = ImageIO.read(new File("src/test/resources/Images/image2.jpg"));

    }

}
