import WebPages.BaseTest;
import WebPages.CinemasPage;
import WebPages.MainPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CinemasPageTest extends BaseTest {

    CinemasPage cinemasPage;
    MainPage mainePage;

    @BeforeClass
    public void closedLanguagePopUp() {
        cinemasPage = new CinemasPage();
        mainePage = new MainPage();

        mainePage.openMainPage();
        mainePage.closeLocationPopUp();
        cinemasPage.openCinemasPage();
    }

    @Test
    public void checkComfortEasyPass() { cinemasPage.checkEasyPassBtn(); }

    @Test
    public void checkComfortVip() { cinemasPage.checkVipBtn(); }

    @Test
    public void checkComfortLux() { cinemasPage.checkLuxBtn(); }


}

