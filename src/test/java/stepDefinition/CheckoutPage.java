package stepDefinition;

import io.cucumber.java.en.Then;

import static pages.CheckoutPage.*;

public class CheckoutPage {


    @Then("User should be able to view that the order has been completed successfully")
    public void user_should_be_able_to_view_that_the_order_has_been_completed_successfully () throws InterruptedException {
        visibility_thank_you_for_your_order_page();
    }

}
