package com.siigo.qa.stepdefinitions;

import com.siigo.qa.exceptions.ResponseCode;
import com.siigo.qa.questions.StatusCode;
import com.siigo.qa.tasks.Delete;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.siigo.qa.utils.Constant.ERROR_CODE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class DeleteStepDefinitions {
    @When("I use the delete with path")
    public void iUseTheDeleteWithPath() {
        theActorInTheSpotlight().attemptsTo(Delete.users());
    }

    @Then("I should see the status code after delete is {int}")
    public void iShouldSeeTheStatusCodeAfterDeleteIs(Integer statusCode) {
        theActorInTheSpotlight().should(
                seeThat(StatusCode.is(), equalTo(statusCode)
                ).orComplainWith(ResponseCode.class, ERROR_CODE));
    }

}
