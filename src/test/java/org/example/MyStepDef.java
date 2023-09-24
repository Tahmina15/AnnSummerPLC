package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepDef {
    HomePage homePage=new HomePage();
    RegisterPage registerPage=new RegisterPage();
    @Given("I am on HomePage")
    public void i_am_on_home_page() {
        homePage.accept_the_cookies();


    }
    @When("I click on user button {string} icon")
    public void i_click_on_user_button_icon(String button) {
        homePage.click_on_the_Create_account_icon(button);

    }
    @Then("click on create account")
    public void click_on_create_account() {

    }
    @When("I enter all registration details")
    public void i_enter_all_registration_details() {
    registerPage.register_details();
    }
    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {

    }

}
