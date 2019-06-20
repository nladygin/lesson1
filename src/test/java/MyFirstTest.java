import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyFirstTest {

    private WebDriver driver;
    private Logger logger = LogManager.getLogger(MyFirstTest.class);

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("Setup ChromeDriver");
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
        logger.info("Bye");
    }

    @Test
    public void testOpenOtusPage() {
        logger.info("Open page");
        driver.get("https://otus.ru/");
    }

}
