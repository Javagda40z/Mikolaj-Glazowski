package ZadaniaNaEnumach.Zadanko;

import java.util.ArrayList;
import java.util.List;

public class ProductServices {

    private final List<Product> products;

    public List<Product> retrieveFruits() {
        List<Product> owoce = new ArrayList<>();

        for (Product product :
                products) {
            if (ProductType.OWOCE == product.getProductType()) {
                owoce.add(product);
            }
        }
        return owoce;
    }

    public ProductServices(List<Product> products) {
        this.products = products;
    }
}
