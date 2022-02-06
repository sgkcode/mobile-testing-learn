package learn.mobile.testing.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class StartPage extends BasePage {

  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='onBoarding-btn-skip']")
  private MobileElement skipButton;

  public LoginPage skipButton() {
    skipButton.click();
    return new LoginPage();
  }
}
