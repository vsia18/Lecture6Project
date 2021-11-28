package AutomationFinalProject.stepDefinitions;

import AutomationFinalProject.pages.HomePage1ALV;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Homepage1aLVSteps {
    HomePage1ALV homePage = new HomePage1ALV();


    @Given("Open 1aLv homepage")
    public void openALvHomepage() {
        homePage.open1aLvHomePage();
    }

    @When("Accept all cookies")
    public void acceptAllCookies() {
        homePage.acceptCookies();
    }

    @And("Initiate product search")
    public void initiateProductSearch() {
        homePage.startProductSearch();
    }
}
