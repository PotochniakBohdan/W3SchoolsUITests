package com.locators;

import org.openqa.selenium.By;

public enum LogInLocators implements BaseLocator {


    //    SIGN_IN_MENU_BUTTON(By.id("signInSubmit")),
    LOG_IN_MAIN_PAGE_BUTTON(By.xpath("//a[@id=\"w3loginbtn\"]")),
//    SIGN_IN_WITH_IMDB_BUTTON(By.xpath("//span[@class=\"auth-provider-text\" and contains(text(), 'Sign in with IMDb')]")),
    EMAIL_FIELD(By.name("email")),
    PASSWORD_FIELD(By.id("current-password")),
    TICK_ELEMENT(By.cssSelector("div._3L6qc > svg > path")),
    SIGN_IN_BUTTON(By.xpath("//button[@class=\"_1VfsI _OD95i _3_H0V\"]"));


    private By path;

    LogInLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
