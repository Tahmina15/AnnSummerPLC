package org.example;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils extends BasePage{
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }
    public static void typeTextFromElement(By by,String text){
        driver.findElement(by).sendKeys(text);

    }
    public static String getTextFromElement(By by){
       return driver.findElement(by).getText();
    }
    public static String getUrl(By by){
      return driver.getCurrentUrl();
    }
  public static long timeStamp(){
      Timestamp timestamp=new Timestamp(System.currentTimeMillis());
      return timestamp.getTime();
  }
  public static void waitForElementToBeClickable(By by,long duration){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
    wait.until(ExpectedConditions.elementToBeClickable(by));
  }
  public void alert_accept(){
      Alert alert = driver.switchTo().alert();
      alert.accept();
  }
    public static String currentTimeStamp(){
        Date date = new Date();
        SimpleDateFormat sdf =new SimpleDateFormat("ddMMyymmss");
        return sdf.format(date);
    }

  //method for screenshot
  public static void captureScreenshot(String fileName) {
      //Convert web driver object to TakeScreenshot
      TakesScreenshot scrShot
              = ((TakesScreenshot) driver);
      //Call getScreenshotAs method to create image file
      File
              SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
      //Move image file to new destination
      File destFile = new
              File("src\\test\\Screenshots\\" + fileName + "" + currentTimeStamp()+".png");

      //Copy file at destination
      try
      {
          FileUtils.copyFile(SrcFile,destFile);
      }
      catch (IOException e)
      {
          e.printStackTrace();


      }


  }

}
