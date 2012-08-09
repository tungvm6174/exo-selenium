package org.exoplatform.selenium.platform.ecms.fnchigh;

import org.exoplatform.selenium.TestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ECMS_FncHigh01 extends TestSuite {

  @Test(groups = {"ecms", "fnchigh"})
  @Override
  public void defaultTestCase() {
    log("defaultTestCase");
    Assert.assertTrue(true);
  }

}
