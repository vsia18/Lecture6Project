package AutomationFinalProject.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    static String itemName;
   static String itemPrice;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

}
