package product;

import java.util.Map;
import java.util.Objects;


public class Product {

    private String name;
    private double price;
    private int kg;

    public Product(String name, double price, int kg) {
        setName(name);
        setPrice(price);
        setKg(kg);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getKg() {
        return kg;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        }
        this.price = price;
    }

    public void setKg(int kg) {
        if (kg <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        }
        this.kg = kg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Продукт - " +name + ", цена - " + price +", кол-во - " + kg;
    }


}


