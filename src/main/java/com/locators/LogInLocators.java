package com.locators;

import org.openqa.selenium.By;

public enum LogInLocators implements BaseLocator {


    //    SIGN_IN_MENU_BUTTON(By.id("signInSubmit")),
    SIGN_IN_MAIN_PAGE_BUTTON(By.xpath("//div[@class=\"ipc-button__text\" and contains(text(), 'Sign In')]")),
    SIGN_IN_WITH_IMDB_BUTTON(By.xpath("//span[@class=\"auth-provider-text\" and contains(text(), 'Sign in with IMDb')]")),
    EMAIL_FIELD(By.id("ap_email")),
    PASSWORD_FIELD(By.id("ap_password")),
    SIGN_IN_BUTTON(By.id("signInSubmit"));


    private By path;

    LogInLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
