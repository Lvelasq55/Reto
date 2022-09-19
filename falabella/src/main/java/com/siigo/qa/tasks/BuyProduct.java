package com.siigo.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.siigo.qa.userinterfaces.BuyProduct.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class BuyProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ADD_PRODUCT),
                Click.on(ADD_QUANTY),
                Click.on(ADD_WARRANTY),
                WaitUntil.the(BUTTON_BAG_MARKET, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(BUTTON_BAG_MARKET),
                Click.on(GO_BUY));
    }

    public static BuyProduct selected() {
        return Tasks.instrumented(BuyProduct.class);
    }
}
