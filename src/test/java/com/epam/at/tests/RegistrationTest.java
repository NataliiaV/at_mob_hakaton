package com.epam.at.tests;

import com.epam.at.businesslogic.LoginPageBL;
import org.testng.annotations.Test;

import static com.epam.at.utils.driver.ConstantUtils.*;

public class RegistrationTest extends TestBase {

    private LoginPageBL login = new LoginPageBL();

    @Test
    public void register (){
        login.loginApp(EMAIL_NOT_REGISTERED)
             .registerApp();
    }


}
