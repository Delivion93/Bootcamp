import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        Iterator<Integer> iterator = list.iterator();

//        pero tambien podemos usar method removeIf(Predicate<?>)
//        list.removeIf(x->x%2!=0);
        while (iterator.hasNext()){
            int item = iterator.next();
            if(item%2!=0){
                iterator.remove();
            }
        }
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
