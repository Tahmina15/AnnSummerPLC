package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    private By _cookies= By.cssSelector("button#onetrust-accept-btn-handler");
   public void accept_the_cookies(){
       clickOnElement(_cookies);

   }
   private By _userIcon=By.cssSelector("svg.icon.icon-account");
public void click_on_the_Create_account_icon(String button){
    clickOnElement(_userIcon);

}


}
