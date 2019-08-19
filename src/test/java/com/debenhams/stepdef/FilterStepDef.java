package com.debenhams.stepdef;

import com.debenhams.pageobject.Filter;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.Matchers.is;

public class FilterStepDef {
    private Filter filter=new Filter();
    @When("^I move to Men$")
    public void iMoveToMen() {
        filter.customerSelectedLink();
    }

    @And("^I click on All shoes & boots$")
    public void iClickOnAllShoesBoots() {
        filter.selectedLink();
    }
    @Then("^I able to see the product$")
    public void iAbleToSeeTheProduct() {
       // String actual1=filter.header();
        //assertThat("page header is not as expected ",actual1,is(equalToIgnoringWhiteSpace("Men's footwear")));
    }

    @Then("^I take a Screen shot$")
    public void iTakeAScreensShot() throws IOException {
        filter.sceenShot();
    }

}
