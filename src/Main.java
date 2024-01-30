import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("Argentina");
//        list1.add("Bulgaria");
//        list1.add("Canada");
//        list1.add("Denmark");
//        list1.add("Narnia");
//        System.out.println("Collection: " + list1);
//        System.out.println("Collection's size: " + list1.size());
//        System.out.println(list1.get(1));
//        if (!list1.contains("England")) {
//            System.out.println("England is not in collection");
//            list1.set(4, "England");
//        }
//        System.out.println("Collection: " + list1);
//        System.out.println("Collection's size: " + list1.size());
//        System.out.println(list1.indexOf("England"));
//        int ie = list1.indexOf("England");
//        list1.set(ie, "United Kingdom");
//        System.out.println("Collection: " + list1);
//        System.out.println("Collection's size: " + list1.size());
//
//        System.out.println("Collection Using for Loop: ");
//        for (int i = 0; i < list1.size(); i++) {
//            System.out.println(list1.get(i));
//        }
//        System.out.println("\nCollection Using While loop:");
//        int i = 0;
//        while (i < list1.size()){
//            System.out.println(list1.get(i));
//            i++;
//        }
//        System.out.println("\nCollection Using Advanced For Loop: ");
//        for (String string : list1) {
//            System.out.println(string);
//        }
//        System.out.println("\nCollection Using Iterator");
//        Iterator<String> iterator = list1.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        list1.trimToSize();
//        list1.ensureCapacity(100);
//        String[] array = (String[]) list1.toArray();
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println("List: " + list);
        list.add(3, "three");
        list.addLast("six");
        list.addFirst("zero");
        System.out.println("List: " + list);
        list.remove("three");
        System.out.println("List: " + list);
        System.out.println("Loop for: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        ListIterator<String> itBeg = list.listIterator();
        System.out.println("\nLoop forward: ");
        while (itBeg.hasNext()){
            System.out.println(itBeg.next());
        }

        System.out.println("\nLoop backward: ");
        while (itBeg.hasPrevious()){
            System.out.println(itBeg.previous());
        }

        ListIterator<String> itIndex = list.listIterator(4);
        System.out.println("\nLoop from index: ");
        while (itIndex.hasNext()){
            System.out.println(itIndex.next());
        }

        Iterator<String> itDesc = list.descendingIterator();
        System.out.println("\nLoop with descending Iterator");
        while (itDesc.hasNext()){
            System.out.println(itDesc.next());
        }
        itIndex.set("6");
        itIndex.add("7");
        Collections.sort(list);
        System.out.println("\nSorted List:");
        for (String string : list) {
            System.out.println(string);
        }
    }
}