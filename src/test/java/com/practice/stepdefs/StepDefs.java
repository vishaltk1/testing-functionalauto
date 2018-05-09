package com.practice.stepdefs;

import javax.inject.Inject;
import com.practice.pages.LandingPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {

    private final LandingPage landingPage;

    @Inject
    public StepDefs(final LandingPage landingPage) {
        this.landingPage = landingPage;
    }

    @Given("^I am on Amazon home page$")
    public void i_am_on_Amazon_home_page()  {
        // Write code here that turns the phrase above into concrete actions
    	landingPage.CheckIfIamOnLandingPage();
    	
        
    }

    @When("^I search for ([^\\\"]*)$")
    public void i_search_for_Samsung_phones(String str1)  {
        // Write code here that turns the phrase above into concrete actions
    	landingPage.Search(str1);
       
    }

    @Then("^I should see list of Samsung phones displayed$")
    public void i_should_see_list_of_Samsung_phones_displayed() {
        // Write code here that turns the phrase above into concrete actions
    	landingPage.verifySamsung();
       
    }

    
}