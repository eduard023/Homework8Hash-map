import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class PhoneBook {
    private final HashMap<String, String> phoneBook = new HashMap<>();

    public void addPhone(String name, String number){
        phoneBook.put(name, number);
    }

    public Set<Map.Entry<String, String>> getEntries(){
        return phoneBook.entrySet();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook1 = (PhoneBook) o;
        return Objects.equals(phoneBook, phoneBook1.phoneBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneBook);
    }
}
