package homework_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User_reviewTest extends AbstractStart {
    private static Logger logger = LoggerFactory.getLogger(User_reviewTest.class);

    @Test
    @DisplayName("Review TEST")
    void user_review() {

        logger.info("Review");
        getDriver().findElement(By.xpath("//*[@id='browse']/li/ul/li[1]/a")).click();
        getDriver().findElement(By.linkText("Hacking Exposed Wireless")).click();
        getDriver().findElement(By.id("write_review")).click();
        Assertions.assertEquals("Оставить отзыв о товаре",
                getDriver().findElement(By.xpath("//*[@id='add_review_form']/fieldset/legend")).getText());

    }
}
