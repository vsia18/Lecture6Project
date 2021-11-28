package AutomationFinalProject.stepDefinitions;

import AutomationFinalProject.pages.CustomerOrderPage;
import io.cucumber.java.en.And;

public class CustomerOrderSteps {
    CustomerOrderPage orderPage = new CustomerOrderPage();

    @And("Get in unregistered with email")
    public void getInUnregisteredWithEmail() {
        orderPage.getInUnregistered();
    }

    @And("Choose where to receive item")
    public void chooseWhereToReceiveItem() {
        orderPage.chooseWhereToReceive();
    }

    @And("Fill in customer info")
    public void fillInCustomerInfo() {
        orderPage.fillInCustomerData();
    }

    @And("Click on save and continue")
    public void clickOnSaveAndContinue() {
        orderPage.proceedToPaymentChoice();
    }
}
