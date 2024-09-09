package com.hrm.orange.steps;

import com.hrm.orange.pageobjects.AddEmployeePageObject;
import net.bytebuddy.asm.Advice;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class AddEmployeeStep {

    AddEmployeePageObject addEmployeePageObject = new AddEmployeePageObject();

    @Step
    public void setFirstName(String firstName) {
        addEmployeePageObject.firstNameInput.sendKeys(firstName);
    }

    @Step
    public void setMiddleName(String middleName) {
        addEmployeePageObject.middleNameInput.sendKeys(middleName);
    }

    @Step
    public void setLastName(String lastName) {
        addEmployeePageObject.lastNameInput.sendKeys(lastName);
    }

    @Step
    public void setId(String id) {
        addEmployeePageObject.idInput.clear();
        addEmployeePageObject.createCheck.click();
        addEmployeePageObject.idInput.sendKeys(id);
    }

    @Step
    public void setUserName(String userName) {
        addEmployeePageObject.userNameInput.sendKeys(userName);
    }

    @Step
    public void setPassword(String password) {
        addEmployeePageObject.passwordInput.sendKeys(password);
    }

    @Step
    public void setConfirmPassword(String password) {
        addEmployeePageObject.confirmPasswordInput.sendKeys(password);
        addEmployeePageObject.confirmPasswordInput.sendKeys(Keys.ENTER);
    }

    @Step
    public void clickSaveButton() {
        addEmployeePageObject.saveButton.click();
    }







}
