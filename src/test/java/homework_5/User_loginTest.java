package homework_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User_loginTest extends AbstractStart {

    private static Logger logger = LoggerFactory.getLogger(User_loginTest.class);

    @Test
    @DisplayName("Login TEST")
    void user_login() {

        logger.info("Login");
        getDriver().findElement(By.id("login_link")).click();
        getDriver().findElement(By.id("id_login-username")).sendKeys("test@test.lv");
        getDriver().findElement(By.id("id_login-password")).sendKeys("testingtest");
        getDriver().findElement(By.name("login_submit")).click();
        Assertions.assertEquals("Oscar - Sandbox", getDriver().getTitle());

    }
}
