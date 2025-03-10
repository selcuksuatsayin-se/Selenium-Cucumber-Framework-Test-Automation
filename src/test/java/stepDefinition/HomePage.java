package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.HomePage.*;
import static pages.LoginPage.*;

public class HomePage {


    @Given("User is logged in and on the product page")
    public void user_is_logged_in_and_on_the_product_page() throws InterruptedException {

        open_site();
        sendkeys_username();
        sendkeys_password();
        click_login_btn();

    }


    @When("User click on Logout button")
    public void user_click_on_Logout_button_() throws InterruptedException {

        click_hamburger_menu_button();
        click_hamburger_menu_logOut_button();

    }


    @When("User adds the product to the cart, makes the payment and completes the purchase")
    public void user_adds_the_product_to_the_cart_makes_the_payment_and_completes_the_purchase() throws InterruptedException {

        click_add_to_cart_btn_sauce_labs_backpack();
        click_add_to_cart_btn_sauce_labs_bolt_t_shirt();

        click_cart_btn();

        click_checkout_btn();

        sendkeys_first_name();
        sendkeys_last_name();
        sendkeys_zip_postal_code();

        click_continue_btn();

        click_finish_btn();
    }

    @Then(("User should be able to view the product page"))
    public void user_should_be_able_to_view_the_product_page() throws InterruptedException {

        visibility_sauce_labs_backpack();
        visibility_sauce_labs_bike_light();
        visibility_sauce_labs_bolt_t_shirt();
        visibility_sauce_labs_fleece_jacket();
        visibility_sauce_labs_onesie();
        visibility_sauce_labs_all_the_things_t_shirt_red();

    }

}
