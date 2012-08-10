package org.exoplatform.selenium.gatein.demo;

import java.util.concurrent.TimeUnit;

import org.exoplatform.selenium.BaseTestSuite;
import org.exoplatform.selenium.gatein.GateinTestSuite;
import org.exoplatform.selenium.platform.PlatformTestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GTN_demo extends GateinTestSuite{
  @BeforeGroups(groups = {"gatein"})
  public void beforeGroups() throws Exception {
    String browser = System.getProperty("browser");
    if(browser.equals("chrome")){
      driver = new ChromeDriver();
    } else {
      driver = new FirefoxDriver();
    }
    baseUrl = System.getProperty("baseUrl");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  
  @AfterGroups(groups = {"gatein"})
  public void afterGroups() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      Assert.fail(verificationErrorString);
    }
  }

  @Test(groups = {"gatein", "demo"})
  public void gateinDemo() throws Exception {
    driver.get(baseUrl + "");
    
    log("logging in as root");
    login("root", "gtn");
    
    log("going to Dashboard");
    waitForElementPresent(By.linkText("Dashboard"));
    driver.findElement(By.linkText("Dashboard")).click();
    driver.findElement(By.linkText("Add Gadgets")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("a.CloseButton")).click();

    log("loging out");
    logout();  
  }
  
}
