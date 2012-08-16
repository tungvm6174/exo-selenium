package org.exoplatform.selenium.platform.social.regression.space;

import org.exoplatform.selenium.platform.social.SocialTestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccessSpacePage extends SocialTestSuite{
  @Test(groups = {"social", "regression", "space"})
  public void gotoSpace() {
    log("gotoSpace");
    Assert.assertTrue(true);
  }

  public void defaultTestCase() {
    log("defaultTestCase");
    Assert.assertTrue(true);
  }

}
