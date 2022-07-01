package com.nextBase.pages;

import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public static void loginAsHR() {
        String username=ConfigurationReader.getProperty("username.hr");
        System.out.println(username);
        String password= ConfigurationReader.getProperty("password");
        System.out.println(password);
        Driver.getDriver().get(ConfigurationReader.getProperty("nextBase.url"));

        Driver.getDriver().findElement(By.name("USER_LOGIN")).sendKeys(username);
        Driver.getDriver().findElement(By.name("USER_PASSWORD")).sendKeys(password);
        Driver.getDriver().findElement(By.className("login-btn")).click();
    }

     public static void loginAsHelpdesk(){
         String username=ConfigurationReader.getProperty("username.helpdesk");
         System.out.println(username);
         String password= ConfigurationReader.getProperty("password");
         System.out.println(password);
         Driver.getDriver().get(ConfigurationReader.getProperty("nextBase.url"));

         Driver.getDriver().findElement(By.name("USER_LOGIN")).sendKeys(username);
         Driver.getDriver().findElement(By.name("USER_PASSWORD")).sendKeys(password);
         Driver.getDriver().findElement(By.className("login-btn")).click();
     }

     public static void loginAsMarketing(){
         String username=ConfigurationReader.getProperty("username.marketing");
         System.out.println(username);
         String password= ConfigurationReader.getProperty("password");
         System.out.println(password);
         Driver.getDriver().get(ConfigurationReader.getProperty("nextBase.url"));

         Driver.getDriver().findElement(By.name("USER_LOGIN")).sendKeys(username);
         Driver.getDriver().findElement(By.name("USER_PASSWORD")).sendKeys(password);
         Driver.getDriver().findElement(By.className("login-btn")).click();

     }
}
