package com.siigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GooglePage {
    public static final Target LBL_GOOGLE = Target.the("Search on google").locatedBy("//input[@class='gLFyf gsfi']");

    public static final Target BTN_SEARCH = Target.the("Button to search on google").locatedBy("//input[@class='gNO89b']");

    public static final Target SELECT_PAGE = Target.the("Access to Falabella page").locatedBy("(//*[@class='LC20lb MBeuO DKV0Md'])[1]");

}
