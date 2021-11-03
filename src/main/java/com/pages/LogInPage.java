package com.pages;

import com.elements.ButtonElement;
import com.elements.FieldElement;
import com.locators.LogInLocators;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage {

    ButtonElement signInButton;
    ButtonElement signInWithIMDbButton;
    ButtonElement signInMainMenuButton;

    FieldElement emailField;
    FieldElement passwordField;

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public LogInPage setEmail(String text) {
        if (emailField == null) {
            emailField = new FieldElement(this.driver, LogInLocators.EMAIL_FIELD);
        }
        emailField.sendKeys(text);

        return this;
    }

    public LogInPage setPassword(String text) {
        if (passwordField == null) {
            passwordField = new FieldElement(this.driver, LogInLocators.PASSWORD_FIELD);
        }
        passwordField.sendKeys(text);
        return this;
    }

    public LogInPage clickSignInMainMenuButton() {
        if (signInMainMenuButton == null) {
            signInMainMenuButton = new ButtonElement(this.driver, LogInLocators.SIGN_IN_MAIN_PAGE_BUTTON);
        }
        signInMainMenuButton.click();
        return this;
    }

    public LogInPage clickSignInWithIMDbButton() {
        if (signInWithIMDbButton == null) {
            signInWithIMDbButton = new ButtonElement(this.driver, LogInLocators.SIGN_IN_WITH_IMDB_BUTTON);
        }
        signInWithIMDbButton.click();
        return this;
    }

    public LogInPage clickSignInButton(){
        if (signInButton == null){
            signInButton = new ButtonElement(this.driver, LogInLocators.SIGN_IN_BUTTON);
        }
        signInButton.click();
        return this;
    }
}
