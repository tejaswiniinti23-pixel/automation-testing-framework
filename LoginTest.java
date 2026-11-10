package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyValidLogin() {
        driver.get("https://example.com");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin123");
        
        // Assertions can be added here
    }
}
