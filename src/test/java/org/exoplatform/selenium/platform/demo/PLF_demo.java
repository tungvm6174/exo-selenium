package org.exoplatform.selenium.platform.demo;

import org.exoplatform.selenium.TestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
/*import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
*/
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PLF_demo extends TestSuite {

  @Test(groups = {"platform", "demo"})
  public void defaultTestCase() {
    log("defaultTestCase");
    Assert.assertTrue(true);
  }


  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();
  
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://google.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test(groups = {"platform", "demo"})
  public void testCase() throws Exception {
    setUp();
    
    driver.get(baseUrl + "");
    driver.findElement(By.id("gbqfq")).clear();
    driver.findElement(By.id("gbqfq")).sendKeys("selenium");
    for (int second = 0;; second++) {
      if (second >= 60) {
        //fail("timeout");
        System.out.println("Timeout");
      }
      try { if (isElementPresent(By.linkText("Selenium - Web Browser Automation"))) break; } catch (Exception e) {}
      Thread.sleep(1000);
    }

    driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
    driver.findElement(By.id("q")).clear();
    driver.findElement(By.id("q")).sendKeys("web driver");
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.xpath("//div[@id='cse']/div/div/div[5]/div[2]/div/div/div/div/table/tbody/tr/td[2]/div/a/b")).click();
    driver.findElement(By.linkText("Remote Control to WebDriver Migration Notes")).click();
    
    tearDown();
  }

  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      //fail(verificationErrorString);
      System.out.println(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }
  
}
