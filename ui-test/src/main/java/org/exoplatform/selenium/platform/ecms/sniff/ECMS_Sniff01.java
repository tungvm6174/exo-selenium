package org.exoplatform.selenium.platform.ecms.sniff;

import org.exoplatform.selenium.platform.ecms.EcmsTestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ECMS_Sniff01 extends EcmsTestSuite{

  @Test(groups = {"ecms", "sniff"})
  public void defaultTestCase(){
    log("defaultTestCase");
    Assert.assertTrue(true);
  }

}
