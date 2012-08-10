package org.exoplatform.selenium.platform.social.smoke;

import org.exoplatform.selenium.platform.social.SocialTestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SOC_Smoke01 extends SocialTestSuite{
  @Test(groups = {"social", "smoke"})
  public void testcase1() {
    log("testcase1");
    Assert.assertTrue(true);
  }

  public void defaultTestCase() {
    log("defaultTestCase");
    Assert.assertTrue(true);
  }

}
