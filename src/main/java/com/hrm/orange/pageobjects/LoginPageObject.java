package com.hrm.orange.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
public class LoginPageObject extends PageObject {


    @FindBy(name = "username")
    public WebElementFacade userNameInput;

    @FindBy(name = "password")
    public WebElementFacade passwordInput;

    @FindBy(xpath = "//button[@type ='submit']")
    public WebElementFacade loginButton;


}
