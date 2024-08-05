package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginButton;

    public void openWebsite() {
        driver.navigate().to(ConfigReader.getValue("url"));
    }

    public void enterUserNameAndPassword(String name, String pass) {
        username.sendKeys(name);
        password.sendKeys(pass);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
