package colibri.pages;

import colibri.tools.ApplicationManager;
import org.openqa.selenium.By;

public class AuthorizationPage extends BasePages{

    public AuthorizationPage(ApplicationManager app) {
        super(app);
        wd = app.getDriver();
    }


    public void login() throws InterruptedException {
        String login = "A.Batjuta@avia-centr.ru";
        String password = "Z[p326!!";
        click(By.xpath(".//button[@class=\"Button Button--primary Button--lg AuthForm__ButtonRight\"]"));
    }
}
