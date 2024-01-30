import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Argentina");
        list1.add("Bulgaria");
        list1.add("Canada");
        list1.add("Denmark");
        list1.add("Narnia");
        System.out.println("Collection: " + list1);
        System.out.println("Collection's size: " + list1.size());
        System.out.println(list1.get(1));
        if (!list1.contains("England")) {
            System.out.println("England is not in collection");
            list1.set(4, "England");
        }
        System.out.println("Collection: " + list1);
        System.out.println("Collection's size: " + list1.size());
        System.out.println(list1.indexOf("England"));
        int ie = list1.indexOf("England");
        list1.set(ie, "United Kingdom");
        System.out.println("Collection: " + list1);
        System.out.println("Collection's size: " + list1.size());
    }
}