package com.siigo.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.siigo.qa.userinterfaces.BuyProduct.RESUME_PRICE;

public class ValidatePrice implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return RESUME_PRICE.isVisibleFor(actor);
    }

    public static ValidatePrice forShipping() {
        return new ValidatePrice();
    }
}
