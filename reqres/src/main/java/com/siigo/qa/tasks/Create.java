package com.siigo.qa.tasks;

import com.siigo.qa.models.BuilderEmployee;
import com.siigo.qa.models.Employee;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.siigo.qa.utils.Constant.PATH_USER;
import static com.siigo.qa.utils.JsonConverter.getJson;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Create implements Task {
    private Employee dataEmployee;

    public Create(Employee dataEmployee) {
        this.dataEmployee = dataEmployee;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger logger = Logger.getLogger(List.class.getName());
        actor.attemptsTo(Post.to(PATH_USER).with(requestSpecification -> requestSpecification.header("Content-Type", "application/json")
                .body(getJson(dataEmployee))));
        logger.log(Level.INFO, "User created");
        SerenityRest.lastResponse().prettyPrint();
    }

    public static Create user(BuilderEmployee userData) {
        return instrumented(Create.class, userData.build());
    }
}
