package org.exoplatform.selenium.platform.social.sniff;

import org.exoplatform.selenium.platform.social.SocialTestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SOC_Sniff01 extends SocialTestSuite{

  @Test(groups = {"social", "sniff"})
  public void defaultTestCase(){
    log("defaultTestCase");
    Assert.assertTrue(true);
  }

}
