package AutomationFinalProject.pages;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class HomePage1ALV {

    private final By searchForm = By.id("q");
    private final By searchButton = By.className("main-search-submit");
    private final By cookiesAcceptAll = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");

    @Test
    public void open1aLvHomePage() {
        Configuration.holdBrowserOpen = true;
        open("https://www.1a.lv/");
        getWebDriver().manage().window().maximize();
    }
@Test
    public void acceptCookies() {
        $(cookiesAcceptAll).click();
    }
@Test
    public void startProductSearch() {
        $(searchForm).sendKeys("Macbook pro");
        $(searchButton).submit();
    }
}
