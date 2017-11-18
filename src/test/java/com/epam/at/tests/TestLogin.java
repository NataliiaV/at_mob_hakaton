package com.epam.at.tests;

import com.epam.at.businesslogic.LoginPageBL;
import org.testng.annotations.Test;

import static com.epam.at.utils.ConstantUtil.EMAIL_REGISTERED;
import static com.epam.at.utils.ConstantUtil.PASSWORD_REGISTERED;

public class TestLogin extends TestBase{

    private LoginPageBL login = new LoginPageBL();

    @Test
    public void login(){
        login.loginApp(EMAIL_REGISTERED, PASSWORD_REGISTERED)
             .logoutApp();
    }
}
