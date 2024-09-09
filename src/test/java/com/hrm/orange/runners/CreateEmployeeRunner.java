package com.hrm.orange.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/create_employee.feature",
        glue = "com.hrm.orange.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class CreateEmployeeRunner {
}
