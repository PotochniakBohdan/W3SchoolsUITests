package com.pages;

import com.elements.ButtonElement;
import com.elements.FieldElement;
import com.locators.MainPageLocators;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }
ButtonElement searchButton;
    FieldElement searchField;

    public MainPage setSearch(String text) {
        if (searchField == null) {
            searchField = new FieldElement(this.driver, MainPageLocators.SEARCH_FIELD_MAIN_MENU);
        }
        searchField.sendKeys(text);
        return this;
    }

    public MainPage clickSearchButton(){
        if (searchButton == null){
            searchButton = new ButtonElement(this.driver, MainPageLocators.SEARCH_BUTTON);
        }
        searchButton.click();
        return this;
    }
}
