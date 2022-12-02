package homework_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class LoginPageTest extends AbstractTest {

    @Test
    @DisplayName("Login TEST")
    void user_login() {

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage
                .clickLoginButton()
                .sendKeysUsername()
                .sendKeysPassword()
                .clickLoginSubmitButton();
        Assertions.assertEquals("http://selenium1py.pythonanywhere.com/ru/", getWebDriver().getCurrentUrl());

    }

    @Test
    @DisplayName("Login TEST")
    void user_logout() {

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage
                .clickLoginButton()
                .sendKeysUsername()
                .sendKeysPassword()
                .clickLoginSubmitButton()
                .clickLogoutButton();
        Assertions.assertEquals("http://selenium1py.pythonanywhere.com/ru/", getWebDriver().getCurrentUrl());

    }
}