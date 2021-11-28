package AutomationFinalProject.stepDefinitions;

import AutomationFinalProject.pages.ProductChoicePage;
import io.cucumber.java.en.And;

public class ProductChoiceSteps {
    ProductChoicePage productChoice = new ProductChoicePage();

    @And("Choose specific category and subcategory")
    public void chooseSpecificCategoryAndSubcategory() {
        productChoice.findProduct();
    }

    @And("Choose needed product")
    public void chooseNeededProduct() {
        productChoice.chooseProduct();
    }

    @And("Add product to cart and go to cart")
    public void addProductToCartAndGoToCart() {
        productChoice.addingToCart();
    }

    @And("Validate product name and price")
    public void validateProductNameAndPrice() {
        productChoice.validatingProductDetails();
    }

    @And("Choose to continue to order")
    public void chooseToContinueToOrder() {
        productChoice.proceedToOrder();
    }
}
