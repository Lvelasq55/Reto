package com.siigo.qa.tasks;

import com.siigo.qa.models.BuilderEmployee;
import com.siigo.qa.models.Employee;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.siigo.qa.utils.Constant.MODIFY_USER;
import static com.siigo.qa.utils.JsonConverter.getJson;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Update implements Task {
    private Employee dataEmployee;

    public Update(Employee dataEmployee) {
        this.dataEmployee = dataEmployee;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger logger = Logger.getLogger(List.class.getName());
        actor.attemptsTo(Put.to(MODIFY_USER).with(requestSpecification -> requestSpecification.header("Content-Type", "application/json")
                .body(getJson(dataEmployee))));
        logger.log(Level.INFO, "Update user");
        SerenityRest.lastResponse().prettyPrint();
    }

    public static Update userData(BuilderEmployee userData) {
        return instrumented(Update.class, userData.build());
    }
}
