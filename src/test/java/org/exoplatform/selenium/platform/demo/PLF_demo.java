package org.exoplatform.selenium.platform.demo;

import java.util.concurrent.TimeUnit;

import org.exoplatform.selenium.BaseTestSuite;
import org.exoplatform.selenium.platform.PlatformTestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class PLF_demo extends PlatformTestSuite{
  
  @BeforeGroups(groups = {"platform"})
  public void beforeGroups() throws Exception {
    log("TUNGVM: beforeGroups");
    //driver = new FirefoxDriver();
    //System.setProperty("webdriver.chrome.driver", "chromedriver");
    driver = new ChromeDriver();
    baseUrl = "http://google.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterGroups(groups = {"platform"})
  public void afterGroups() throws Exception {
    log("TUNGVM: afterGroups");
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      Assert.fail(verificationErrorString);
    }
  }


  @Test(groups = {"platform", "demo"})
  public void searchSelenium() throws Exception {
    driver.get(baseUrl + "");
    driver.findElement(By.id("gbqfq")).clear();
    driver.findElement(By.id("gbqfq")).sendKeys("selenium");    
    waitForElementPresent(By.linkText("Selenium - Web Browser Automation"));
    driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
    driver.findElement(By.id("q")).clear();
    driver.findElement(By.id("q")).sendKeys("web driver");
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.xpath("//div[@id='cse']/div/div/div[5]/div[2]/div/div/div/div/table/tbody/tr/td[2]/div/a/b")).click();
    driver.findElement(By.linkText("Remote Control to WebDriver Migration Notes")).click();
  }

  @Test(groups = {"platform", "demo"})
  public void searchOther() throws Exception {
    driver.get(baseUrl + "");
    driver.findElement(By.id("gbqfq")).clear();
    driver.findElement(By.id("gbqfq")).sendKeys("selenium");    
    waitForElementPresent(By.linkText("Selenium - Web Browser Automation"));
    driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
  }
 
}
