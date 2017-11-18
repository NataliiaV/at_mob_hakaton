package com.epam.at.businesslogic;

import com.epam.at.pageobjects.DownBar;
import com.epam.at.pageobjects.GmailPage;
import com.epam.at.pageobjects.LoginPage;
import com.epam.at.pageobjects.SecretCodePage;

public class LoginPageBL {

    private LoginPage loginPage = new LoginPage();
    private GmailPage gmailPage = new GmailPage();
    private SecretCodePage secretCodePage = new SecretCodePage();
    private DownBar downBar = new DownBar();

    public CatalogPageBL loginApp (String mail, String password)
    {
        loginPage.getInputEmail().type(mail);
        loginPage.getInputPassword().type(password);
        loginPage.getButtonLogin().waitForVisibility(2000);
        loginPage.getButtonLogin().click();

        return new CatalogPageBL();
    }

    public LoginPageBL loginApp (String mail)
    {
        loginApp (mail, "");

        return this;
    }

    public CatalogPageBL registerApp(){
        int code = gmailPage.getCodeEmail().getSecretCode();
        secretCodePage.getInputSecretCode().type(String.valueOf(code));
        secretCodePage.getButtonSectetCode().click();

        return new CatalogPageBL();
    }

    public LoginPageBL logoutApp(){
        downBar.getBackground().click();
        return this;
    }
}