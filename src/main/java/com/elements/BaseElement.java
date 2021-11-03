package com.elements;

import com.locators.BaseLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// login/Email bohdan.potochnyak@gmail.com
// password 2WzCBvrd+7&KpAy

public class BaseElement {
    protected WebDriver driver;
    public WebElement webElement;
    protected By path;

    public BaseElement(WebDriver driver, BaseLocator locator) {
        this.driver = driver;
        this.path = locator.getPath();
        webElement = driver.findElement(path);
    }

    public BaseElement(WebElement webElement, BaseLocator locator) {
        this.path = locator.getPath();
        this.webElement = webElement.findElement(path);
    }

    public BaseElement(WebElement webElement){
        this.webElement = webElement;
    }
}
