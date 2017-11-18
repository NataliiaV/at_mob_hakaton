package com.epam.at.businesslogic;

import com.epam.at.pageobjects.VideoPage;

public class VideoPageBL {

    private VideoPage videoPage = new VideoPage();

    public VideoPageBL clickOnScringDuringVideo() {
        videoPage.getMainFrame().click();

        return new VideoPageBL();
    }

    public boolean videoIsPlayed() {
        if (!videoPage.getMainFrame().isDisplayed())
            clickOnScringDuringVideo();
        boolean isPlayed = false;
        if (videoPage.getButtonStopReplay().isDisplayed())
            return true;
        if (videoPage.getTimeBar().isDisplayed())
            return true;
        if (videoPage.getTitle().isDisplayed())
            return true;
        if (videoPage.getMenu().isDisplayed())
            return true;
        return isPlayed;
    }
}
