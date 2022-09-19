package com.siigo.qa.stepdefinitions;

import com.siigo.qa.exceptions.ResponseCode;
import com.siigo.qa.exceptions.ResponseSchema;
import com.siigo.qa.questions.StatusCode;
import com.siigo.qa.tasks.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.io.File;

import static com.siigo.qa.utils.Constant.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;


public class GetStepDefinitions {
    @Given("Im conected to the service")
    public void imConectedToTheService() {
        setTheStage(Cast.ofStandardActors());
        theActorCalled("User").can(CallAnApi.at(URL_BASE));
    }

    @When("I use the get with path")
    public void iUseTheGetWithPath() {
        theActorInTheSpotlight().attemptsTo(List.users());
    }

    @Then("I should see the status code is {int}")
    public void iShouldSeeTheStatusCodeIs(Integer statusCode) {
        theActorInTheSpotlight().should(
                seeThat(StatusCode.is(), equalTo(statusCode)
                ).orComplainWith(ResponseCode.class, ERROR_CODE));
    }

    @Then("I should see he correct schema on Json for Get service")
    public void i_should_see_he_correct_schema_on_json_for_get_service() {
        theActorInTheSpotlight().should(
                seeThatResponse(response -> response.body(JsonSchemaValidator
                        .matchesJsonSchema(
                                new File("src/test/resources/schema/GetSchema.json"))))
                        .orComplainWith(ResponseSchema.class, ERROR_SCHEMA));
    }
}