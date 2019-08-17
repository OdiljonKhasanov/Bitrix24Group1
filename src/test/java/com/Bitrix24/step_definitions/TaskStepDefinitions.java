package com.Bitrix24.step_definitions;

import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import com.Bitrix24.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaskStepDefinitions {

    Pages pages = new Pages();

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        pages.loginPage().goToLandingPage();
    }

    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String role) {

        pages.loginPage().login(role);


    }

    @Then("user navigates to {string}")
    public void user_navigates_to(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user should type {string} inside things to do field")
    public void user_should_type_inside_things_to_do_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user should send image from the path {string}")
    public void user_should_send_image_from_the_path(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();


    }
}
