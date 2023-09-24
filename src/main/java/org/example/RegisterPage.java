package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;

public class RegisterPage extends Utils{
    private By _createAccount=By.xpath("//a[@id=\"register-tab\"]");
    private By _firstName=By.cssSelector("input#registration-form-fname");
    private By _lastName=By.cssSelector("input#registration-form-lname");
    private By _email=By.cssSelector("input#registration-form-email");
    private By _confirmEmail=By.cssSelector("input#registration-form-email-confirm");
    private By _passWord=By.cssSelector("input#registration-form-password");
    private By _tickBox=By.cssSelector("input#newsletter-toggle");
    private By _clickCreateAccount=By.xpath(" //div[@class='tab-pane active']//button[@class='btn btn-block btn-primary']");
    private By _alert=By.cssSelector("div.dy-lb-close");
public void register_details(){
clickOnElement(_createAccount);
typeTextFromElement(_firstName,LoadProp.getProperty("FirstName"));
typeTextFromElement(_lastName,LoadProp.getProperty("LastName"));
typeTextFromElement(_email,LoadProp.getProperty("Email"));


typeTextFromElement(_confirmEmail,LoadProp.getProperty("Email"));
typeTextFromElement(_passWord,LoadProp.getProperty("PassWord"));
    //driver.switchTo().frame(driver.findElement(By.cssSelector("div#dytmpl-101711782")));
   // clickOnElement(_alert);

//    alert_accept();
//    driver.switchTo().defaultContent();
    waitForElementToBeClickable(_clickCreateAccount,10);

clickOnElement(_clickCreateAccount);
}
}
