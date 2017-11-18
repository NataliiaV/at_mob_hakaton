package com.epam.at.pageobjects;

import com.epam.at.utils.driver.DriverRepository;
import elements.Button;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VideoPage {
    @FindBy(id = "player_control_play_pause_replay_button")
    private WebElement stopReplayButton;
    @FindBy(id="time_bar")
    private WebElement timeBar;
    @FindBy(id="player_video_title_view")
    private WebElement title;
    @FindBy(id="player_overflow_button")
    private WebElement menu;
    @FindBy(xpath = "//*[@class='android.widget.FrameLayout' and ./parent::*[@class='android.view.ViewGroup']]")//
    private WebElement mainFrame;

    public Button getButtonStopReplay() {
        return new Button(stopReplayButton);
    }
    public Button getTimeBar() {
        return new Button(timeBar);
    }
    public Button getTitle() {
        return new Button(title);
    }
    public Button getMenu() {
        return new Button(menu);
    }
    public Button getMainFrame() {
        return new Button(mainFrame);
    }

    public VideoPage() {
        PageFactory.initElements(DriverRepository.getAndroidDriver(), this);
    }
}