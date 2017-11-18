package com.epam.at.businesslogic;

import com.epam.at.pageobjects.VideoPage;

public class VideoPageBL {

    private VideoPage videoPage = new VideoPage();

    public VideoPageBL clickOnScringDuringVideo() {
        videoPage.getMainFrame().click();

        return new VideoPageBL();
    }

    public boolean videoIsPlayed() {
        boolean isPlayed = false;
        if (videoPage.getButtonStopReplay().isDisplayed())
            isPlayed = true;
        if (videoPage.getTimeBar().isDisplayed())
            isPlayed = true;
        if (videoPage.getTitle().isDisplayed())
            isPlayed = true;
        if (videoPage.getMenu().isDisplayed())
            isPlayed = true;
        return isPlayed;
    }
}
