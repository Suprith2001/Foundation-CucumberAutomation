package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomeSteps {
    HomePage homePage=new HomePage();
    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }
}
