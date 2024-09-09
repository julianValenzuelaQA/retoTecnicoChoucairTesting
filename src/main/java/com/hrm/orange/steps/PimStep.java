package com.hrm.orange.steps;

import com.hrm.orange.pageobjects.PimPageObject;
import net.thucydides.core.annotations.Step;

public class PimStep {

    PimPageObject pimPageObject = new PimPageObject();

    @Step
    public void clickAddButton() {
        pimPageObject.addButton.click();
    }

    @Step
    public void clickSerchButton() {
        pimPageObject.serchButton.click();
    }

    @Step
    public void setId(String id) {
        pimPageObject.idInput.sendKeys(id);
    }

    @Step
    public void verifyCreateUser(String id) {

        String idText = pimPageObject.verifyId(id).getText();

        if (!idText.equals(id)){
            throw new AssertionError("El id no coincide");
        }

    }


}
