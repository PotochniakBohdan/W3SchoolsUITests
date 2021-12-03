package com.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
protected WebDriver driver;
private MainPage mainPage;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage getMainPage() {
        mainPage = new MainPage(driver);
        return mainPage;
    }
}
