package com.epam.at.tests;

import com.epam.at.businesslogic.LoginPageBL;
import org.testng.annotations.Test;
import com.epam.at.utils.driver.ConstantUtils.*;

import static com.epam.at.utils.driver.ConstantUtils.*;

public class TestLogin {

    private LoginPageBL login = new LoginPageBL();

    @Test
    public void Login(){
        login.loginApp(EMAIL_REGISTERED, PASSWORD_REGISTERED);
    }
}
