package com.locators;

import org.openqa.selenium.By;

public enum MainPageLocators implements BaseLocator{
    SEARCH_FIELD_MAIN_MENU(By.xpath("//input[@id=\"suggestion-search\"]")),
    SEARCH_BUTTON(By.id("suggestion-search-button"));
    private By path;

    MainPageLocators(By path) {
        this.path = path;
    }
    @Override
    public By getPath() {
        return null;
    }
}
