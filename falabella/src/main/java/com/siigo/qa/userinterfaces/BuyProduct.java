package com.siigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuyProduct {

    public static final Target ADD_PRODUCT = Target.the("Select product to bag")
            .located(By.id("buttonForCustomers"));

    public static final Target ADD_QUANTY = Target.the("Increase the amount of the product")
            .located(By.id("testId-stepper-increment-btn"));

    public static final Target ADD_WARRANTY = Target.the("Add theextended warranty")
            .located(By.xpath("(//*[@class='jsx-4235874631 label   '])[2]"));

    public static final Target BUTTON_BAG_MARKET = Target.the("Button baf market")
            .located(By.xpath("//*[@class='jsx-3482180836 button button-primary button-medium ']"));

    public static final Target GO_BUY = Target.the("Button go to buy")
            .located(By.xpath("//*[@class='fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase']"));

    public static final Target RESUME_PRICE = Target.the("Item product price")
            .located(By.xpath("//*[@class='fbra_text fbra_test_orderSummary__itemsTotalPrice fbra_orderSummary__itemsTotalPrice']"));

}

