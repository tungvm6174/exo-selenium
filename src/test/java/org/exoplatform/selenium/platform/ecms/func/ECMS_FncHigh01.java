package org.exoplatform.selenium.platform.ecms.func;

import org.exoplatform.selenium.platform.ecms.EcmsTestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ECMS_FncHigh01 extends EcmsTestSuite{

  @Test(groups = {"ecms", "func"})
  public void defaultTestCase() {
    log("defaultTestCase");
    Assert.assertTrue(true);
  }

}
