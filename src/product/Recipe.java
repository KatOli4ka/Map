package product;

import java.util.*;

public class Recipe {
    private String name;
    private int price;
    private final Map<Product,Integer> products;

    public Recipe(String name) {
        this.name = name;
        this.products = new HashMap();
        this.price=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void addProducts(Product product) {
        addProducts(product,1);
    }
    public void addProducts(Product product,int amount) {
        if (products.containsKey(product)) {
            throw new IllegalArgumentException("Такой продукт уже есть в списке!");
        }
        products.put(product,amount);
        price+=amount*product.getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + ", цена - " + price +". "+ products;
    }
}
