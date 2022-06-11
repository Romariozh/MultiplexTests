package WebPages;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Configuration.baseUrl;

public class BaseTest {

    @BeforeSuite
    public void beforeClass() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1600x900";
        baseUrl = "https://multiplex.ua";
        Configuration.savePageSource = false;
    }
}
