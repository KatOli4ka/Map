package product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProductList {
    private final Map<Product,Integer> products=new HashMap();

    public void addProduct(Product product,int amount) {
        if (products.containsKey(product)) {
            throw new IllegalArgumentException("Такой продукт уже есть в списке!");
        }
        products.put(product,amount);
        System.out.println("Вы добавили: "+product);
    }
    public void addProduct(Product product) {
        addProduct(product,1);
    }
    public void deleteProduct(Product product) {
        products.remove(product);
    }

    @Override
    public String toString() {
        return "Список продуктов: " + products;
    }
}
