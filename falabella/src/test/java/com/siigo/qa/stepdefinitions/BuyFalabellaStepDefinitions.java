package com.siigo.qa.stepdefinitions;

import com.siigo.qa.exceptions.GeneralException;
import com.siigo.qa.questions.ValidatePrice;
import com.siigo.qa.tasks.BuyProduct;
import com.siigo.qa.tasks.Search;
import com.siigo.qa.tasks.SelectProduct;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static com.siigo.qa.utils.Constants.MSG_EXCEPTION;
import static com.siigo.qa.utils.Constants.URL;

public class BuyFalabellaStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Juan");
    }

    @Given("I enter falabella")
    public void iEnterFalabella() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.url(URL));
    }

    @When("I select the product {string} with extended warranty")
    public void iSelectTheProductWithExtendedWarranty(String product) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.onGoogle());
        OnStage.theActorInTheSpotlight().attemptsTo(SelectProduct.onFalabella(product));
        OnStage.theActorInTheSpotlight().attemptsTo(BuyProduct.selected());
    }

    @Then("I valid the value of the product on the dispatch page")
    public void iValidTheValueOfTheProductOnTheDispatchPage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePrice.forShipping(), Matchers.is(true))
                .orComplainWith(GeneralException.class, MSG_EXCEPTION));
    }

}
