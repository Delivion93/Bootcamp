import java.util.ArrayList;
import java.util.List;

public class Lambda {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        System.out.println("List before sorting: "+list);
        list.sort((frut1,frut2)->frut1.compareTo(frut2));
        System.out.println("List after sorting: "+list);
    }
}
