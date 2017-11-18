package com.epam.at.assertion;

import com.epam.at.businesslogic.VideoPageBL;
import org.testng.Assert;

public class VideoAssertions {
    public static void assertVieoIsPlayed(VideoPageBL video) {
        Assert.assertTrue(video.videoIsPlayed(), "Video should play when click start video!");
    }
}
