package com.hrm.orange.stepdefinitions;

import com.hrm.orange.steps.AddEmployeeStep;
import com.hrm.orange.steps.DashBoarStep;
import com.hrm.orange.steps.LoginStep;
import com.hrm.orange.steps.PimStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CreateEmployeeStepDefinition {

    @Steps
    LoginStep loginStep;

    @Steps
    DashBoarStep dashBoarStep;

    @Steps
    PimStep pimStep;

    @Steps
    AddEmployeeStep addEmployeeStep;


    @Given("^el usuario se loguea en orange hrm con usuario \"([^\"]*)\" y contraseña \"([^\"]*)\"$")
    public void elUsuarioSeLogueaEnOrangeHrmConUsuarioYContraseña(String user, String password) {
        loginStep.openPage();
        loginStep.setUserName(user);
        loginStep.setPassword(password);
        loginStep.clickLoginButton();
    }


    @When("^el se dirigi ala opcion PIM$")
    public void elSeDirigiAlaOpcionPIM() {
        dashBoarStep.clickPimLink();
    }

    @When("^ingresa en agregar$")
    public void ingresaEnAgregar() {
        pimStep.clickAddButton();
    }

    @When("^agrega un nuevo usuario con nombre \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void agregaUnNuevoUsuarioConNombre(String firstName, String middleName, String lastName, String id) {
        addEmployeeStep.setFirstName(firstName);
        addEmployeeStep.setMiddleName(middleName);
        addEmployeeStep.setLastName(lastName);
        addEmployeeStep.setId(id);
    }

    @When("^agrega la informacio adicional username \"([^\"]*)\", password \"([^\"]*)\"$")
    public void agregaLaInformacioAdicionalUsernamePassword(String userName, String password) {
        addEmployeeStep.setUserName(userName);
        addEmployeeStep.setPassword(password);
        addEmployeeStep.setConfirmPassword(password);
        addEmployeeStep.clickSaveButton();
    }

    @Then("^debeira ver el usuario creado con id \"([^\"]*)\"$")
    public void debeiraVerElUsuarioCreadoConId(String id) {
        pimStep.setId(id);
        pimStep.clickSerchButton();
        pimStep.verifyCreateUser(id);
    }
}
