package org.exoplatform.selenium.platform.social.space;

import org.exoplatform.selenium.TestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccessSpacePage extends TestSuite{
  @Test(groups = {"social"})
  public void gotoSpace() {
    log("gotoSpace");
    Assert.assertTrue(true);
  }

  @Override
  public void defaultTestCase() {
    log("defaultTestCase");
    Assert.assertTrue(true);
  }

}
