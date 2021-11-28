package AutomationFinalProject.stepDefinitions;

import AutomationFinalProject.pages.OrderFinalPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class OrderFinalSteps {
    OrderFinalPage finalPage = new OrderFinalPage();
    @And("Choose pay upon receival")
    public void choosePayUponReceival() {
        finalPage.paymentDetails();
    }

    @Then("Validate user info and price")
    public void validateUserInfoAndPrice() {
        finalPage.checkFinalData();
    }
}
