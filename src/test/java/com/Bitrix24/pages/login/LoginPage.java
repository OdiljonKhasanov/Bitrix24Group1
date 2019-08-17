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

    public void goToLandingPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url" + ConfigurationReader.getProperty("environment")));

    }

    public void login(String role){
        String username = "";
        String password = "";
        if(role.equalsIgnoreCase("helpdesk")){
            username = ConfigurationReader.getProperty("helpdeskusername");
            password = ConfigurationReader.getProperty("helpdeskpassword");
        }else if( role.equalsIgnoreCase("marketing")){
            username = ConfigurationReader.getProperty("marketingusername");
            password = ConfigurationReader.getProperty("marketingpassword");
        }else if(role.equalsIgnoreCase("hr")){
            username = ConfigurationReader.getProperty("hrusername");
            password = ConfigurationReader.getProperty("hrpassword");
        }

        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();

    }

}