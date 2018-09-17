package colibri.tools;

import colibri.pages.AuthorizationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  public final Properties properties;
  private WebDriver wd;

  private String browser;
  private AuthorizationPage authorisationHalper;

  public ApplicationManager(String browser) {
    this.browser = browser;
    properties = new Properties();
  }

  public void init() throws IOException {
    String target = System.getProperty("target", "local");
    properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
  }

  public void stop() {
    if (wd != null) {
      wd.quit();
    }
  }

  public WebDriver getDriver() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    wd.get(properties.getProperty("web.baseUrl"));
    return wd;
  }


  public AuthorizationPage authorisation() {
    if (authorisationHalper == null) {
      authorisationHalper = new AuthorizationPage(this);
    }
    return authorisationHalper;
  }
}
