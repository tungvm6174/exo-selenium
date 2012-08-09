package org.exoplatform.selenium.platform.ecms.sniff;

import org.exoplatform.selenium.TestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ECMS_Sniff01 extends TestSuite {

  @Test(groups = {"ecms", "sniff"})
  public void defaultTestCase() {
    log("defaultTestCase");
    Assert.assertTrue(true);
  }

}
