package learn.mobile.testing.pages;

import learn.mobile.testing.driver.DriverManager;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

  public BasePage() {
    PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
  }
}
