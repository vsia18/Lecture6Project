package AutomationFinalProject.pages;

import AutomationFinalProject.models.Product;
import AutomationFinalProject.models.Customer;
import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class OrderFinalPage {
    private final By paymentOnSite = By.cssSelector("div[class='label-in clearfix']");
    private final By nameField = By.cssSelector("div[class='name']");
    private final By phoneField = By.cssSelector("div[class='address']");
    private final By finalPrice = By.cssSelector("div[class='price fr']");

    @Test
    public void paymentDetails() {
        $$(paymentOnSite).get(1).click();
    }
    public void checkFinalData(){
        Customer customer = new Customer();
        Product product = new Product();
        $(nameField).shouldHave(Condition.text(customer.getName()));
        $(nameField).shouldHave(Condition.text(customer.getSurname()));
        System.out.println("Your full name is correct.");
        $(phoneField).shouldHave(Condition.text(customer.getPhoneNumber()));
        System.out.println("Your phone number is correct.");
        $(finalPrice).shouldHave(Condition.text(product.getItemPrice()));
        System.out.println("Product final price is correct.");
    }
}
