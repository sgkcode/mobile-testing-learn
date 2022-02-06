package learn.mobile.testing.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {

  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='login-btn-login']")
  private MobileElement loginButton;

  public boolean isLoginButtonDisplayed() {
    return loginButton.isDisplayed();
  }
}
