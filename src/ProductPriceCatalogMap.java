import java.util.HashMap;
import java.util.Map;

public class ProductPriceCatalogMap {
    public static void main(String[] args) {

        Map<String, Double> products = new HashMap<>();

        products.put("Laptop", 450.0);
        products.put("Mouse", 15.0);
        products.put("Keyboard", 25.0);
        products.put("Monitor", 110.0);
        products.put("Headphones", 35.0);

        IO.println("========== PRODUCT PRICE CATALOG ==========");

        for (Map.Entry<String, Double> product : products.entrySet()) {

            IO.println(
                    product.getKey()
                            + " -> "
                            + product.getValue()
                            + " OMR"
            );
        }

        String searchProduct = "Laptop";

        if (products.containsKey(searchProduct)) {

            IO.println(
                    "\nPrice of "
                            + searchProduct
                            + ": "
                            + products.get(searchProduct)
                            + " OMR"
            );
        }

        products.put("Laptop", 425.0);

        IO.println(
                "Updated Laptop Price: "
                        + products.get("Laptop")
                        + " OMR"
        );
    }
}
