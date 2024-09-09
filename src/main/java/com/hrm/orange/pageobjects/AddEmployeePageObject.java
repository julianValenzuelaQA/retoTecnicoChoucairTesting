package com.hrm.orange.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AddEmployeePageObject extends PageObject {

    @FindBy(name = "firstName")
    public WebElementFacade firstNameInput;

    @FindBy(name = "middleName")
    public WebElementFacade middleNameInput;

    @FindBy(name = "lastName")
    public WebElementFacade lastNameInput;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElementFacade idInput;

    @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
    public WebElementFacade createCheck;

    @FindBy(xpath = "(//input)[8]")
    public WebElementFacade userNameInput;

    @FindBy(xpath = "(//input)[11]")
    public WebElementFacade passwordInput;

    @FindBy(xpath = "(//input)[12]")
    public WebElementFacade confirmPasswordInput;

    @FindBy(xpath = "//button[@type ='submit']")
    public WebElementFacade saveButton;
}
