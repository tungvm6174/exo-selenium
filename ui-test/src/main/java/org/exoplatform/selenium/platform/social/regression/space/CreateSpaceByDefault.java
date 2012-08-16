package org.exoplatform.selenium.platform.social.regression.space;

import org.exoplatform.selenium.platform.social.SocialTestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateSpaceByDefault extends SocialTestSuite{
  @Test(groups = {"social", "regression", "space"})
  public void createSpace() {
    log("createSpace");
    Assert.assertTrue(true);
  }

  public void defaultTestCase() {
    log("defaultTestCase");
    Assert.assertTrue(true);
  }

}
