package ru.colibri.tests;

import org.testng.annotations.Test;

public class AuthorizationTest extends BaseTests {

    @Test
    public void testAuthorization () throws InterruptedException {
        app.authorisation().login();
    }

}
