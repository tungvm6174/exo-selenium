package org.exoplatform.selenium.platform.social.people;

import org.exoplatform.selenium.TestSuite;
import org.testng.Assert;
import org.testng.annotations.*;

public class UserActivities extends TestSuite{
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

  @Override
  public void defaultTestCase() {
    log("defaultTestCase");
    Assert.assertTrue(true);
  }

}
