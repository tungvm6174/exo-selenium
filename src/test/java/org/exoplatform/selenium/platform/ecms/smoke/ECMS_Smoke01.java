package org.exoplatform.selenium.platform.ecms.smoke;

import org.exoplatform.selenium.TestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ECMS_Smoke01 extends TestSuite {

  @Test(groups = {"ecms", "smoke"})
  @Override
  public void defaultTestCase() {
    log("defaultTestCase");
    Assert.assertTrue(true);
  }

}
