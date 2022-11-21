import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Task3 {
    private final Map<String, Integer> map = new HashMap<>();

    public void addToMap(String key, int value){
        if (!map.containsKey(key)){
            map.put(key, value);
        }else {
            int valueFromMap = map.get(key);
            if (valueFromMap == value){
                throw new IllegalArgumentException("Такой ключ уже есть и значения совпадают");
            } else {
                map.put(key, value);
            }
        }
    }

    @Override
    public String toString() {
        return "Task3{" +
                "map=" + map +
                '}';
    }
}
