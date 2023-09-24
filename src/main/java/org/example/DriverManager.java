package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class DriverManager extends Utils{

    public void openBrowser(){
        driver=new ChromeDriver();
        driver.get("https://www.annsummers.com/?gclid=CjwKCAjwmbqoBhAgEiwACIjzEPUMBz0qIgV1lSxAOxXYiHajyW2x30hBeZUOfvLlK850fqKLCOg0cxoCxtMQAvD_BwE");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void closeBrowser(){
        driver.close();
    }
}
