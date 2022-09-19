package com.siigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FalabellaHomePage {
    public static final Target SEARCH_AREA = Target.the("Search area")
            .located(By.id("testId-SearchBar-Input"));

    public static final Target BUTTON_SEARCH = Target.the("Button search")
            .located(By.className("SearchBar-module_searchBtnIcon__6KVum"));

    public static final Target SELECT_PRODUCT = Target.the("Select product")
            .locatedBy("(//*[@class='jsx-3128226947'])[1]");

}
