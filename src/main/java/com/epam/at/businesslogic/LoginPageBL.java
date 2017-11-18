package com.epam.at.businesslogic;

import com.epam.at.pageobjects.LoginPage;

public class LoginPageBL {

    private LoginPage loginPage = new LoginPage();

    public LoginPageBL loginApp (String mail, String password)
    {
        loginPage.getInputEmail().type(mail);
        loginPage.getInputPassword().type(password);
        loginPage.getButtonLogin().waitForVisibility(2000);
        loginPage.getButtonLogin().click();

        return this;
    }


    public LoginPageBL loginApp (String mail)
    {
        loginApp (mail, "");
        return this;
    }

    public LoginPageBL registerApp(){

        return this;
    }
}
