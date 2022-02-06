package learn.mobile.testing;

import learn.mobile.testing.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StartPageTest extends BaseTest{

  @Test
  public void shouldSkipIntroductionTest() {
    boolean isSkipWorks = new StartPage()
        .skipButton()
        .isLoginButtonDisplayed();
    Assert.assertTrue(isSkipWorks);
  }
}
