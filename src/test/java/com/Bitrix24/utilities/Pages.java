package com.Bitrix24.utilities;

import com.Bitrix24.pages.login.LoginPage;
import com.Bitrix24.step_definitions.TaskStepDefinitions;

public class Pages {

   private LoginPage loginPage;

   public  LoginPage loginPage(){
       if(loginPage == null){
           loginPage = new LoginPage();
       }

       return loginPage;
   }

}
