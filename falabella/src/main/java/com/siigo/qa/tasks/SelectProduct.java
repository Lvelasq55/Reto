package com.siigo.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.siigo.qa.userinterfaces.FalabellaHomePage.*;

public class SelectProduct implements Task {
    private String product;

    SelectProduct(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(product).into(SEARCH_AREA),
                Click.on(BUTTON_SEARCH),
                Click.on(SELECT_PRODUCT));
    }

    public static SelectProduct onFalabella(String product) {
        return Tasks.instrumented(SelectProduct.class, product);
    }
}
