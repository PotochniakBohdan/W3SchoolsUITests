package com.pages;

import com.elements.ButtonElement;
import com.elements.FieldElement;
import com.elements.LabelElement;
import com.locators.LogInLocators;
import com.locators.MainPageLocators;
import com.tools.WaitSwitcher;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage {

    private WaitSwitcher waitSwitcher;

    ButtonElement signInButton;
    ButtonElement signInWithIMDbButton;
    ButtonElement signInMainMenuButton;
    ButtonElement tickElement;

    LabelElement resultTitle;

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

    public LogInPage clickLogInMainMenuButton() {
        if (signInMainMenuButton == null) {
            signInMainMenuButton = new ButtonElement(this.driver, LogInLocators.LOG_IN_MAIN_PAGE_BUTTON);
        }
        signInMainMenuButton.click();
        return new LogInPage(driver);
    }

    public LogInPage clickSignInButton(){
        if (signInButton == null){
            signInButton = new ButtonElement(this.driver, LogInLocators.SIGN_IN_BUTTON);
        }
        signInButton.click();
        return new LogInPage(driver);
    }
    public LabelElement getUserNameAfterLogIn() {
        waitSwitcher.setImplicitWaits(10);
        if (resultTitle == null) {
            resultTitle = new LabelElement(this.driver, MainPageLocators.ACCOUNT_NAME);
        }
        return resultTitle;
    }

    public boolean isTickElementActive(){
        waitSwitcher.setImplicitWaits(3);
        if(tickElement == null){
            try {
                tickElement = new ButtonElement(this.driver, LogInLocators.TICK_ELEMENT);
            } catch (NoSuchElementException e){
                return false;
            }
        }
        return true;
    }
}
