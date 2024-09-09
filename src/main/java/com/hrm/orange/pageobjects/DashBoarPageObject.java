package com.hrm.orange.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class DashBoarPageObject extends PageObject {

    @FindBy(xpath = "(//li[@class ='oxd-main-menu-item-wrapper'])[2]")
    public WebElementFacade pimOption;
}
