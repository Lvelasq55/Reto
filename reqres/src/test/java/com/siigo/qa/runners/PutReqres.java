package com.siigo.qa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/put_reqres.feature",
        glue = "com.siigo.qa.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class PutReqres {
}
