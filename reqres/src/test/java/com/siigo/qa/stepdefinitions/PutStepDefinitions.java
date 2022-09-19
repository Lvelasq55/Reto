package com.siigo.qa.stepdefinitions;

import com.siigo.qa.exceptions.ResponseCode;
import com.siigo.qa.exceptions.ResponseSchema;
import com.siigo.qa.questions.StatusCode;
import com.siigo.qa.tasks.Update;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;

import java.io.File;

import static com.siigo.qa.models.BuilderEmployee.with;
import static com.siigo.qa.utils.Constant.ERROR_CODE;
import static com.siigo.qa.utils.Constant.ERROR_SCHEMA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

public class PutStepDefinitions {

    @When("I update user with name {string} and job {string}")
    public void iUpdateUserWithNameAndJob(String nameUser, String jobUser) {
        theActorInTheSpotlight().attemptsTo(Update.userData(with().name(nameUser).job(jobUser)));
    }

    @Then("I should see the code is {int}")
    public void iShouldSeeTheCodeIs(Integer statusCode) {
        theActorInTheSpotlight().should(
                seeThat(StatusCode.is(), equalTo(statusCode)
                ).orComplainWith(ResponseCode.class, ERROR_CODE));
    }

    @Then("I should see he correct schema on Json for Put service")
    public void iShouldSeeHeCorrectSchemaOnJsonForPutService() {
        theActorInTheSpotlight().should(
                seeThatResponse(response -> response.body(JsonSchemaValidator
                        .matchesJsonSchema(
                                new File("src/test/resources/schema/PutSchema.json"))))
                        .orComplainWith(ResponseSchema.class, ERROR_SCHEMA));
    }
}
