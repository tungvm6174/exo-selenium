package org.exoplatform.selenium.gatein.demo;

import org.exoplatform.selenium.TestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GTN_demo extends TestSuite {

  @Test(groups = {"gatein", "demo"})
  public void defaultTestCase() {
    log("defaultTestCase");
    Assert.assertTrue(true);
  }

}
