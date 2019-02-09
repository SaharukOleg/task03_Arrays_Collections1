import java.util.ArrayList;
import java.util.List;

public class AddListStringIntoListInteger {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList();
        integerList.add(1);
        List newList = integerList;
        newList.add("hello i am String");

        System.out.println(newList);
    }
}
