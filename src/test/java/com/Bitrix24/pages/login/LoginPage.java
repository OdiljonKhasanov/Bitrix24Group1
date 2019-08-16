package com.Bitrix24.pages.login;

import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    @CacheLookup
    public WebElement userNameElement;

    @FindBy(name = "USER_PASSWORD")
    @CacheLookup
    public WebElement passwordElement;

    @FindBy(className = "login-btn")
    public WebElement loginButtonElement;

    public void login(String username, String password) {
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }


}