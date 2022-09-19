package com.siigo.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.siigo.qa.userinterfaces.GooglePage.*;
import static com.siigo.qa.utils.Constants.FALABELLA;

public class Search implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(FALABELLA).into(LBL_GOOGLE),
                Click.on(BTN_SEARCH),
                Click.on(SELECT_PAGE));
    }

    public static Search onGoogle() {
        return Tasks.instrumented(Search.class);
    }
}
