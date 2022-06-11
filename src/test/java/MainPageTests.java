import WebPages.BaseTest;
import WebPages.MainPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainPageTests extends BaseTest {

    MainPage mainePage;

    @BeforeClass
    public void closedLanguagePopUp() {
        mainePage = new MainPage();
        mainePage.openMainPage();
        mainePage.closeLocationPopUp();
    }

    @Test // Тест изменения локализации на русскую
    public void checkChangeLanguage() {

        // Открытие браузером главной старницы сайта Мультиплекс
        mainePage.openMainPage();
        // Нажатие на элемент для открытия бокового меню
        mainePage.clickSideBarMenu();
        //Меняем язык на русский
        mainePage.clickChangeLangRu();
//        String s = mainePage.text();
//        assertThat(s, equalTo("Войти"));
        mainePage.checkLoginButtonText();
    }

    @Test // Тест кнопки "Войти" в левом боковом меню с русской локализацией
    public void checkLangButtonLogin() {
        mainePage.openMainPage();
        mainePage.ifLangUaChangeToRu();
        mainePage.clickSideBarMenu();
        mainePage.checkSideMenuLoginButton();
    }

    @Test // Тест ссылки на сервис Facebook в левом боковом меню
    public void checkFacebookLink() {

        mainePage.openMainPage();
        mainePage.clickSideBarMenu();
        mainePage.checkFacebookLink();
        mainePage.clickFacebookLink();
    }

    @Test // Тест ссылки на сервис Youtube в левом боковом меню
    public void checkYoutubeLink() {

        mainePage.openMainPage();
        mainePage.clickSideBarMenu();
        mainePage.checkYoutubeLink();
        mainePage.clickYoutubeLink();
    }
}
