package ru.colibri.pages;

import ru.colibri.tools.ApplicationManager;
import org.openqa.selenium.By;

import java.util.HashMap;

public class AuthorizationPage extends BasePages{

    private static HashMap<String, String> map;

    private static void initMap(){
        map = new HashMap<>();
        map.put("Germany", "Country");
        map.put("Father", "Parents");
        map.put("Son", "Child");
        map.put("Mouse", "Animal");
    }

    public AuthorizationPage(ApplicationManager app) {
        super(app);
        wd = app.getDriver();
    }


    public void login() {
        type(By.xpath(".//div[text()=\"Email\"]/../following::input"), app.properties.getProperty("auth.login"));
        type(By.xpath(".//input[@type=\"password\"]"), app.properties.getProperty("auth.password"));
        click(By.xpath(".//button[@class=\"Button Button--primary Button--lg AuthForm__ButtonRight\"]"));
    }
}
