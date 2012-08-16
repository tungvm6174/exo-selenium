package org.exoplatform.selenium.platform.social.regression.people;

import org.exoplatform.selenium.platform.social.SocialTestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserProfile extends SocialTestSuite{
  @Test(groups = {"social", "regression", "people"})
  public void editProfile() {
    log("editProfile");
    Assert.assertTrue(true);
  }

  @Test(groups = {"social", "regression", "people"})
  public void uploadAvatar() {
    log("uploadAvatar");
    Assert.assertTrue(true);
  }

  public void defaultTestCase() {
    log("defaultTestCase");
    Assert.assertTrue(true);
  }
  
}
