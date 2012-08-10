package org.exoplatform.selenium.platform.social.regression.people;

import org.exoplatform.selenium.platform.social.SocialTestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserActivities extends SocialTestSuite{
  @Test(groups = {"social"})
  public void createActivity() {
    log("createActivity");
    Assert.assertTrue(true);
  }

  @Test(groups = {"social"})
  public void deleteActivity() {
    log("deleteActivity");
    Assert.assertTrue(true);
  }

  public void defaultTestCase() {
    log("defaultTestCase");
    Assert.assertTrue(true);
  }

}
