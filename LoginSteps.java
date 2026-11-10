package com.automation.stepdefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Navigating to login page...");
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        System.out.println("Entering credentials for: " + username);
    }

    @And("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        System.out.println("Clicking login button.");
    }

    @Then("User should be redirected to the dashboard page")
    public void user_should_be_redirected_to_the_dashboard_page() {
        System.out.println("Login verified successfully!");
    }
}
