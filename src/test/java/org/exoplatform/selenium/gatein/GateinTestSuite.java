package org.exoplatform.selenium.gatein;

import org.exoplatform.selenium.BaseTestSuite;
import org.openqa.selenium.By;

public class GateinTestSuite extends BaseTestSuite {
  public void login(String username, String password) throws Exception{
    driver.findElement(By.linkText("Sign in")).click();
    waitForElementPresent(By.id("UIPortalLoginFormAction"));
    driver.findElement(By.id("UIPortalComponentLogin-username")).clear();
    driver.findElement(By.id("UIPortalComponentLogin-username")).sendKeys(username);
    driver.findElement(By.id("UIPortalComponentLogin-password")).clear();
    driver.findElement(By.id("UIPortalComponentLogin-password")).sendKeys(password);
    driver.findElement(By.id("UIPortalLoginFormAction")).click();    
  }
  
  public void logout() throws Exception {
    waitForElementPresent(By.linkText("Sign out"));
    driver.findElement(By.linkText("Sign out")).click();    
  }  
}
