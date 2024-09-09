package com.hrm.orange.steps;

import com.hrm.orange.pageobjects.LoginPageObject;
import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginStep {

    private static final Logger log = LoggerFactory.getLogger(LoginStep.class);
    LoginPageObject loginPageObject = new LoginPageObject();


    @Step
    public void openPage(){
        loginPageObject.open();
    }

    @Step
    public void setUserName (String userName){
        loginPageObject.userNameInput.sendKeys(userName);
    }

    @Step
    public void setPassword (String password) {
        loginPageObject.passwordInput.sendKeys(password);
    }

    @Step
    public void clickLoginButton() {
        loginPageObject.loginButton.click();
    }
}
