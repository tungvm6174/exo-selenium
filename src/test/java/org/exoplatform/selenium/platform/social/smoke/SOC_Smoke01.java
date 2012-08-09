package org.exoplatform.selenium.platform.social.smoke;

import org.exoplatform.selenium.TestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SOC_Smoke01 extends TestSuite {
  @Test(groups = {"social", "smoke"})
  public void testcase1() {
    log("testcase1");
    Assert.assertTrue(true);
  }

  @Override
  public void defaultTestCase() {
    log("defaultTestCase");
    Assert.assertTrue(true);
  }

}
