package com.locators;

import org.openqa.selenium.By;

public enum MainPageLocators implements BaseLocator{
    SEARCH_FIELD_MAIN_MENU(By.xpath("//input[@id=\"suggestion-search\"]")),
    SEARCH_BUTTON(By.id("suggestion-search-button")),
    ACCOUNT_NAME(By.xpath("//h2[@id=\"profile-name\"]")),
    NAME_OF_ACCOUNT(By.cssSelector("div.sl-user")),
    ACCOUNT_SETTING_BUTTON(By.xpath("//*[@id=\"main\"]/nav/div/div[3]/div[2]/div/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]"));
    private By path;

    MainPageLocators(By path) {
        this.path = path;
    }
    @Override
    public By getPath() {
        return null;
    }
}
