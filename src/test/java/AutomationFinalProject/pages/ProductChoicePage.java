package AutomationFinalProject.pages;

import AutomationFinalProject.models.Product;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ProductChoicePage {

    private final By notebooksCategory = By.cssSelector("img[class='frftyoh']");
    private final By notebookSubcategory = By.cssSelector("div[class='fi65l2d']");
    private final By productOfChoice = By.cssSelector("div[class='sn-product ks-new-product-item ks-catalog-taxons-product']");
    private final By addToCartBtn = By.id("add_to_cart_btn");
    private final By goToCartBtn = By.cssSelector("a[class='main-button']");
    private final By cartProductName = By.cssSelector("p[class='detailed-cart-item__name']");
    private final By cartProductPrice = By.cssSelector("p[class='detailed-cart-item__price']");
    private final By continueOrderBtn = By.cssSelector("input[class='main-button cart-main-button']");

    @Test
    public void findProduct() {
        $$(notebooksCategory).get(0).click();
        $$(notebookSubcategory).get(0).click();
    }

    public void chooseProduct() {
        $(productOfChoice).scrollIntoView(true);
        $$(productOfChoice).get(0).click();
    }

    public void addingToCart() {
        $(addToCartBtn).submit();
        $(goToCartBtn).click();
    }

    public void validatingProductDetails() {
        Product product = new Product();
        $(cartProductName).find("a").shouldHave(text(product.getItemName()));
        System.out.println("Product name in cart correct.");
        $(cartProductPrice).shouldHave(text(product.getItemPrice()));
        System.out.println("Product price in cart is correct.");
    }

    public void proceedToOrder() {
        $(continueOrderBtn).submit();
    }
}
