package com.Bitrix24.pages.login;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.By;

public class homePage {

public void navigateToModule(String linkText){
    Driver.getDriver().findElement(By.linkText(linkText)).click();
}
public void clickOnTopModels(String linkText){

}
}
