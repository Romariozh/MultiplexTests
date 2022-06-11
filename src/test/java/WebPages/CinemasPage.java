package WebPages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;

public class CinemasPage {
    String pageUrl = "/cinemas";

    SelenideElement easyPassBtn = $("body > div.mob_fix_container > div.cimenas_filters > div > div:nth-child(3) > div:nth-child(2)");
    SelenideElement vipBtn = $("body > div.mob_fix_container > div.cimenas_filters > div > div:nth-child(3) > div:nth-child(3)");
    SelenideElement luxBtm = $("body > div.mob_fix_container > div.cimenas_filters > div > div:nth-child(3) > div:nth-child(4)");
    public void openCinemasPage() {
        Selenide.open(baseUrl + pageUrl);
    }

    public void checkEasyPassBtn() {
        easyPassBtn.shouldBe(visible).shouldHave(text("Easy Pass"));
    }
    public void checkVipBtn() {
        vipBtn.shouldBe(visible).shouldHave(text("VIP"));
    }
    public void checkLuxBtn() {
        luxBtm.shouldBe(visible).shouldHave(text("LUX"));
    }
}
