package org.exoplatform.selenium.platform.ecms.smoke;

import org.exoplatform.selenium.platform.ecms.EcmsTestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ECMS_Smoke01 extends EcmsTestSuite{

  @Test(groups = {"ecms", "smoke"})
  public void defaultTestCase() {
    log("defaultTestCase");
    Assert.assertTrue(true);
  }

}
