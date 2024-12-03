import java.util.HashMap;
import java.util.Map;

public class HashMapTest {


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ana",25);
        map.put("Luis",35);
        map.put("Juan",30);
        for (String s : map.keySet()) {
            System.out.printf("%s is %d years old\n", s, map.get(s));
        }
    }
}
