package com.hrm.orange.steps;

import com.hrm.orange.pageobjects.DashBoarPageObject;
import net.thucydides.core.annotations.Step;

public class DashBoarStep {

    DashBoarPageObject dashBoarPageObject = new DashBoarPageObject();

    @Step
    public void clickPimLink (){
        dashBoarPageObject.pimOption.click();
    }
}
