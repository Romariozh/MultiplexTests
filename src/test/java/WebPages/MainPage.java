package WebPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class MainPage {
    String pageUrl = "/";

    SelenideElement sideBarMenuButton = $("body > div.header.header-index > div > img");
    SelenideElement loginButton = $("body > div.header.header-index > div > a.lk_link");
    SelenideElement changeLangButton = $("body > div.left_menu.js-left-menu.on > div > ul > li:nth-child(1) > a");
    SelenideElement sideMenuLoginButton = $("body > div.left_menu.js-left-menu.on > div > div.mob_container > div.menu-block > a");
    SelenideElement faceBookLink = $("body > div.left_menu.js-left-menu.on > div > div:nth-child(6) > div.menu_soc > a:nth-child(1)");
    SelenideElement youtubeLink = $("body > div.left_menu.js-left-menu.on > div > div:nth-child(6) > div.menu_soc > a:nth-child(2)");
    SelenideElement closeLocationPopUpYes = $("body > div.geo_veil.geolocated.desktop-only > div > p.yes");

    public void openMainPage() {
        Selenide.open(baseUrl + pageUrl);
    }

    public void clickSideBarMenu() {
        sideBarMenuButton.click();
    }
    public void clickChangeLangRu() {
        changeLangButton.click();
    }
    public void ifLangUaChangeToRu() {
        String t = loginButton.text();
        if (t.equals("Увійти")) {
            sleep(5000);
            clickSideBarMenu();
            clickChangeLangRu();
        }
    }
    public void checkLoginButtonText() {
            loginButton.shouldHave(text("Войти"));
    }
    public void checkSideMenuLoginButton() { sideMenuLoginButton.shouldHave(text("Войти")).shouldBe(visible); }
    public void checkFacebookLink() { faceBookLink.shouldHave(Condition.text("Facebook")).shouldBe(visible); }
    public void clickFacebookLink() { faceBookLink.click(); }
    public void checkYoutubeLink() { youtubeLink.shouldBe(visible).shouldHave(Condition.text("Youtube")); }
    public void clickYoutubeLink() { youtubeLink.click(); }
    public void closeLocationPopUp() {
        closeLocationPopUpYes.click();
    }
}
