package com.hrm.orange.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class PimPageObject extends PageObject {

    @FindBy(xpath = "//button[@class ='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElementFacade addButton;

    @FindBy(xpath = "//button[@type ='submit']")
    public WebElementFacade serchButton;

    @FindBy(xpath = "(//input[@class ='oxd-input oxd-input--active'])[2]")
    public WebElementFacade idInput;


    public WebElementFacade verifyId (String link) {
        return find(By.xpath("//div[text()='"+link+"']"));
    }


}
