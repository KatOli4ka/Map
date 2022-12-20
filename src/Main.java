import product.Product;
import product.ProductList;
import product.Recipe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ-1.1");
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Иванов Павел Иванович","+78956585555");
        phoneBook.put("Иванов Иван Петрвич","85595263588");
        phoneBook.put("Иванов Иван Иванович","8555623569");
        phoneBook.put("Иванис Павел Иванович","+78956585755");
        phoneBook.put("Превалов Иван Петрвич","85595263988");
        phoneBook.put("Локов Павел Иванович","+78956582555");
        phoneBook.put("Локов Пал Иванович","85595263588");
        phoneBook.put("Ивнов Павел Иванович","+78956785155");
        phoneBook.put("Ивов Иван Петрвич","85595263538");
        phoneBook.put("Инов Олег Иванович","+78956585558");
        phoneBook.put("Иванов Иван Долович","85595263580");
        phoneBook.put("Иваров Павел Иванович","+78956585551");
        phoneBook.put("Дологоров Иван Петрвич","85595263582");
        phoneBook.put("Жолов Павел Иванович","+78956585553");
        phoneBook.put("Топоров Иван Петрвич","85595263584");
        phoneBook.put("Петров Павел Иванович","+78956584555");
        phoneBook.put("Хоолов Иван Петрвич","85595243588");
        phoneBook.put("Цолов Павел Иванович","+78946585555");
        phoneBook.put("Волов Иван Петрвич","85595264488");
        for (Map.Entry<String, String> contact: phoneBook.entrySet()) {
            System.out.println(contact.getKey() + ": " + contact.getValue());
        }
        System.out.println(phoneBook.get("Инов Олег Иванович"));

        System.out.println("ДЗ-1.2");
        Product flour = new Product("Мука", 78.98, 2);
        Product buckwheat = new Product("Греча", 65.96, 1);
        Product bread = new Product("Хлеб", 35.0, 2);
        Product milk = new Product("Молоко", 71.99, 2);
        Product meat = new Product("Мясо", 399.00, 2);
        Set<Product> products = new HashSet<>();
        products.add(flour);
        products.add(bread);
        products.add(buckwheat);
        products.add(meat);
        products.add(milk);
        System.out.println(products);

        ProductList productList = new ProductList(products);
        productList.addProduct(new Product("каша", 56.0, 3));
        productList.addProduct(new Product("банан", 76.0, 3));
//  исключение      productList.addProduct(milk);
        System.out.println(productList);

        Recipe one = new Recipe("Новый рецепт1", 78.0, productList);
        Recipe two = new Recipe("Новый рецепт2", 23.0, productList);
        Recipe three = new Recipe("Новый рецепт3", 65.0, productList);
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(one);
        recipes.add(two);
        recipes.add(three);
        System.out.println(recipes.toString());

        System.out.println("ДЗ-2.1");
        Map<String, List<Integer>> collection=new HashMap<>();
        Random random = new Random();
        List<Integer> numbers1 = new ArrayList<>();
        while (numbers1.size() < 3) {
            numbers1.add(random.nextInt(1000));
        }
        int sum1 = numbers1.stream().mapToInt(Integer::intValue).sum();

        List<Integer> numbers2 = new ArrayList<>();
        while (numbers2.size() < 3) {
            numbers2.add(random.nextInt(1000));
        }
        int sum2 = numbers2.stream().mapToInt(Integer::intValue).sum();

        List<Integer> numbers3 = new ArrayList<>();
        while (numbers3.size() < 3) {
            numbers3.add(random.nextInt(1000));
        }
        int sum3 = numbers3.stream().mapToInt(Integer::intValue).sum();

        List<Integer> numbers4 = new ArrayList<>();
        while (numbers4.size() < 3) {
            numbers4.add(random.nextInt(1000));
        }
        int sum4 = numbers4.stream().mapToInt(Integer::intValue).sum();

        List<Integer> numbers5 = new ArrayList<>();
        while (numbers5.size() < 3) {
            numbers5.add(random.nextInt(1000));
        }
        int sum5 = numbers5.stream().mapToInt(Integer::intValue).sum();

        collection.put("строка 1", numbers1);
        collection.put("строка 2", numbers2);
        collection.put("строка 3", numbers3);
        collection.put("строка 4", numbers4);
        collection.put("строка 5", numbers5);
        for (Map.Entry<String,  List<Integer>> f: collection.entrySet()) {
            System.out.println(f.getKey() + ": " + f.getValue());
        }
        numbers1.clear();
        numbers1.add(sum1);
        numbers2.clear();
        numbers2.add(sum2);
        numbers3.clear();
        numbers3.add(sum3);
        numbers4.clear();
        numbers4.add(sum4);
        numbers5.clear();
        numbers5.add(sum5);
        System.out.println();
        for (Map.Entry<String,  List<Integer>> f: collection.entrySet()) {
            System.out.println(f.getKey() + ": " + f.getValue());
        }








    }
}