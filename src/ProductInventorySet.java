import java.util.HashSet;
import java.util.Set;

public class ProductInventorySet {

    public static void main(String[] args) {

        Set<String> products = new HashSet<>();

        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Monitor");
        products.add("Headphones");

        products.add("Mouse");

        IO.println("========== PRODUCT INVENTORY ==========");

        IO.println("Products:");

        for (String product : products) {
            IO.println("- " + product);
        }

        String searchProduct = "Keyboard";

        if (products.contains(searchProduct)) {
            IO.println("\n" + searchProduct + " is available.");
        } else {
            IO.println("\n" + searchProduct + " was not found.");
        }

        IO.println("Total Unique Products: " + products.size());
    }
}
