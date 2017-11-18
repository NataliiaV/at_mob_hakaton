package com.epam.at.businesslogic;

import com.epam.at.pageobjects.DownBar;

/**
 * Created by Oleg_Shchur on 11/18/2017.
 */
public class BaseLogic {
    private DownBar downBar = new DownBar();

    public BaseLogic logoutApp(){
        downBar.getBackground().click();
        return this;
    }
}
