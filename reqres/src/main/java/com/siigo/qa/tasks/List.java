package com.siigo.qa.tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.siigo.qa.utils.Constant.PATH_USER;

public class List implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger logger = Logger.getLogger(List.class.getName());

        actor.attemptsTo(Get.resource(PATH_USER)
                .with(requestSpecification
                -> requestSpecification.queryParam("page", 2)
                .relaxedHTTPSValidation()));

        logger.log(Level.INFO, "List Users");
        SerenityRest.lastResponse().prettyPrint();
    }

    public static List users() {
        return Tasks.instrumented(List.class);
    }
}
