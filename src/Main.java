import product.Product;
import product.ProductList;
import product.Recipe;

import java.util.*;

public class Main {
    private  static final Map<String, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        System.out.println("ДЗ-1.1");
        PhoneBook phoneBook=new PhoneBook();
        for (int i = 0; i < 20; i++) {
            long num=89815647589L;
            phoneBook.add("N"+(i+1),String.valueOf(num+i));
        }
        phoneBook.print();


        System.out.println("---------------");
        System.out.println("ДЗ-1.2");
        Product flour = new Product("Мука", 78.98, 1);
        Product buckwheat = new Product("Греча", 65.96, 1);
        Product bread = new Product("Хлеб", 35.0, 1);
        Product milk = new Product("Молоко", 71.99, 1);
        Product meat = new Product("Мясо", 399.00, 1);
        Set<Product> products = new HashSet<>();
        products.add(flour);
        products.add(bread);
        System.out.println(products);
        Set<Product> products2 = new HashSet<>();
        products2.add(meat);
        products2.add(milk);
        System.out.println(products2);

        ProductList productList = new ProductList();
        productList.addProduct(new Product("каша", 56.0, 1));
        ProductList productList2 = new ProductList();
        productList2.addProduct(new Product("банан", 76.0, 1));
        System.out.println(productList);
        System.out.println(productList2);

        Recipe one = new Recipe("New recipe 1");
        Recipe two = new Recipe("New recipe 2");
        one.addProducts(meat,2);
        one.addProducts(milk,3);
        two.addProducts(flour,1);
        two.addProducts(buckwheat,4);
        System.out.println(one.toString());
        System.out.println(two.toString());

        System.out.println("---------------");
        System.out.println("ДЗ-1.3");
        map.put("str1",2);
        System.out.println(map);
        tryPut("str2",1);
        System.out.println(map);
        try {
            tryPut("str1", 2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(map);
        tryPut("str1",5);
        System.out.println(map);

        System.out.println("---------------");
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

        System.out.println("---------------");
        System.out.println("ДЗ.2.2");
        Map<Integer,String>ff=new LinkedHashMap<>();

        for (int i = 0; i < 10; i++) {
            int key;
            if (i % 2 == 0) {
                key = 10;
            } else
                key = -10;
            ff.put(key + i, String.valueOf(i));
        }

        for (Map.Entry<Integer, String> ent: ff.entrySet()) {
            System.out.println(ent.getKey() + ": " + ent.getValue());
        }
    }
    public static void tryPut(String key, Integer value) {
        if (map.containsKey(key)&&map.get(key).equals(value) ) {
            throw new IllegalArgumentException("Такой ключ и значение уже есть в карте!");
        }
        map.put(key,value);
    }
}