package AutomationFinalProject.pages;

import AutomationFinalProject.models.Customer;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CustomerOrderPage {

    private final By getViaEmail = By.cssSelector("input[id='user_email']"); //Need the second
    private final By submitUnregistered = By.cssSelector("input[class='users-session-form__submit']"); //need 2nd
    private final By receiveOnSite = By.cssSelector("span[class='title']"); //Need the second element
    private final By pickupPlace = By.cssSelector("div[class='pickup-point-name']"); //Need the second elem
    private final By firstName = By.cssSelector("input[id='address_first_name']");
    private final By lastName = By.cssSelector("input[id='address_last_name']");
    private final By customerPhone = By.cssSelector("input[id='address_phone_number']");
    private final By save = By.cssSelector("button[type='submit']"); //Need the first
    private final By proceedBtn = By.cssSelector("span[class='icon-arrow-right']");

@Test
    public void getInUnregistered() {
        Customer customer = new Customer();
        $$(getViaEmail).get(1).sendKeys(customer.getEmail());
        $$(submitUnregistered).get(1).submit();

    }

    public void chooseWhereToReceive() {
        $$(receiveOnSite).get(1).click();
        $$(pickupPlace).get(1).click();
    }

    public void fillInCustomerData() {
        Customer customer = new Customer();
        $(firstName).sendKeys(customer.getName());
        $(lastName).sendKeys(customer.getSurname());
        $(customerPhone).sendKeys(customer.getPhoneNumber());
    }

    public void proceedToPaymentChoice() {
        $$(save).get(0).submit();
        $(proceedBtn).scrollIntoView("{behavior: \"instant\", block: \"end\", inline: \"end\"}");
        $(proceedBtn).click();

    }
}
