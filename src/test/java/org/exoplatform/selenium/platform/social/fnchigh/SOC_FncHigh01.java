package org.exoplatform.selenium.platform.social.fnchigh;

import org.exoplatform.selenium.TestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SOC_FncHigh01 extends TestSuite{
  @Test(groups = {"social", "fnchigh"})
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
