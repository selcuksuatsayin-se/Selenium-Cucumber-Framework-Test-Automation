package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.LoginPage.*;

public class LoginPage {

    @Given("User navigates to the Login page")
    public void user_navigates_to_the_login_page() throws InterruptedException {
        open_site();
    }


    @When("User successfully enters the log in details")
    public void user_successfully_enters_the_log_in_details () throws InterruptedException {
        sendkeys_username();
        sendkeys_password();
        click_login_btn();
    }


    @When("User successfully enters the locked out user log in details")
    public void user_successfully_enters_the_locked_out_user_log_in_details() throws InterruptedException {
        sendkeys_locked_out_username();
        sendkeys_password();
        click_login_btn();
    }


    @When("User enter information for a non-user account")
    public void user_enter_information_for_a_non_user_account () throws InterruptedException {
        sendkeys_miss_user_username();
        sendkeys_password();
        click_login_btn();
    }


    @Then("User should be able to view Log in page")
    public void user_should_be_able_to_view_Log_in_page () throws InterruptedException {
        visibility_accepted_usernames_are();
    }


    @Then("User should be able to view locked out warning massage")
    public void user_should_be_able_to_view_locked_out_warning_massage() throws InterruptedException {
        visibility_locked_out_user_warning();
    }


    @Then("User should be able to view the miss user warning massage")
    public void user_should_be_able_to_view_thee_miss_warning_massage () throws InterruptedException {
        visibility_miss_user_warning();
    }
}
