package org.exoplatform.selenium.platform.social.space;

import org.exoplatform.selenium.TestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateSpaceByDefault extends TestSuite{
  @Test(groups = {"social"})
  public void createSpace() {
    log("createSpace");
    Assert.assertTrue(true);
  }

  @Override
  public void defaultTestCase() {
    log("defaultTestCase");
    Assert.assertTrue(true);
  }

}
