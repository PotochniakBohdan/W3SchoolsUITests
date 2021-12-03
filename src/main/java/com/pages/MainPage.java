package com.pages;

import com.elements.ButtonElement;
import com.elements.FieldElement;
import com.elements.LabelElement;
import com.locators.MainPageLocators;
import com.tools.WaitSwitcher;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    ButtonElement searchButton;
    ButtonElement clickOnName;
    ButtonElement clickOnSettingAccount;
    FieldElement searchField;
    LabelElement resultTitle;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage setSearch(String text) {
        WaitSwitcher.sleep(6000);
        if (searchField == null) {
            searchField = new FieldElement(this.driver, MainPageLocators.SEARCH_FIELD_MAIN_MENU);
        }
        searchField.sendKeys(text);
        return this;
    }

    public MainPage clickSearchButton() {
        if (searchButton == null) {
            searchButton = new ButtonElement(this.driver, MainPageLocators.SEARCH_BUTTON);
        }
        searchButton.click();
        return this;
    }


    public LabelElement getTitleAfterSearch() {
        WaitSwitcher.sleep(5000);
        if (resultTitle == null) {
            resultTitle = new LabelElement(this.driver, MainPageLocators.ACCOUNT_NAME);
        }
        return resultTitle;
    }

    public MainPage clickOnAccountName() {
        if (clickOnName == null) {
            WaitSwitcher.sleep(15000);

            clickOnName = new ButtonElement(this.driver, MainPageLocators.NAME_OF_ACCOUNT);
        }
        WaitSwitcher.sleep(15000);
        clickOnName.click();
        return new MainPage(driver);
    }

    public MainPage clickOnAccountSetting() {
        if (clickOnSettingAccount == null) {
            WaitSwitcher.sleep(15000);
            clickOnSettingAccount = new ButtonElement(this.driver, MainPageLocators.ACCOUNT_SETTING_BUTTON);
        }
        clickOnSettingAccount.click();
        return new MainPage(driver);
    }
}
