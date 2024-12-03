import java.util.ArrayList;

public class ArrayListSum {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayListSum(arrayList);
    }

    public static void arrayListSum(ArrayList<Integer> list){
        int result =0;
        for (Integer i : list) {
            result+=i;
        }
        System.out.println("The result of sum is "+result);
    }
}
