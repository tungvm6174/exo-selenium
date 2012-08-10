package org.exoplatform.selenium.platform.social.func;

import org.exoplatform.selenium.platform.social.SocialTestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SOC_FncHigh01 extends SocialTestSuite{
  @Test(groups = {"social", "func"})
  public void testcase1() {
    log("testcase1");
    Assert.assertTrue(true);
  }

  public void defaultTestCase() {
    log("defaultTestCase");
    Assert.assertTrue(true);
  }

}
