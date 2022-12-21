import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, String> phoneBook = new HashMap<>();

    public void add(String name, String number) {
        phoneBook.put(name, number);
    }
    public void print() {
        for (Map.Entry<String, String> contact: phoneBook.entrySet()) {
            System.out.println(contact.getKey() + ": " + contact.getValue());
        }
    }
}
