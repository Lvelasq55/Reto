package com.siigo.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.siigo.qa.utils.Constant.MODIFY_USER;

public class Delete implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger logger = Logger.getLogger(List.class.getName());
        actor.attemptsTo(net.serenitybdd.screenplay.rest.interactions.Delete.from(MODIFY_USER).with(requestSpecification -> requestSpecification.header("Content-Type", "application/json")
                .relaxedHTTPSValidation()));
        logger.log(Level.INFO, "Delete user");
    }

    public static Delete users() {
        return Tasks.instrumented(Delete.class);
    }
}
