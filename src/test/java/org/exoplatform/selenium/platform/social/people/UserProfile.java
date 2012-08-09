package org.exoplatform.selenium.platform.social.people;

import org.exoplatform.selenium.TestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserProfile extends TestSuite{
  @Test(groups = {"social"})
  public void editProfile() {
    log("editProfile");
    Assert.assertTrue(true);
  }

  @Test(groups = {"social"})
  public void uploadAvatar() {
    log("uploadAvatar");
    Assert.assertTrue(true);
  }

  @Override
  public void defaultTestCase() {
    log("defaultTestCase");
    Assert.assertTrue(true);
  }
  
}
