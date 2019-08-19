package com.debenhams.stepdef;

import com.debenhams.pageobject.SignIn;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class SignInStepDef {

    private SignIn signIn=new SignIn();

    @When("^I click the sign in$")
    public void iClickTheSignIn() {
    }

    @And("^I enter the email and pass word and click the sing up button$")
    public void iEnterTheEmailAndPassWordAndClickTheSingUpButton() {
    }

    @Then("^I able to sing in\\.$")
    public void iAbleToSingIn() {
       signIn.sign();
     //  String actual=signIn.header();

        //assertThat("user not able to see user name :",actual, Matchers("Hello sandeep,"));

    }
}