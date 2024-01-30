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
//        LinkedList<String> list = new LinkedList<>();
//        list.add("one");
//        list.add("two");
//        list.add("three");
//        list.add("four");
//        list.add("five");
//        System.out.println("List: " + list);
//        list.add(3, "three");
//        list.addLast("six");
//        list.addFirst("zero");
//        System.out.println("List: " + list);
//        list.remove("three");
//        System.out.println("List: " + list);
//        System.out.println("Loop for: ");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        ListIterator<String> itBeg = list.listIterator();
//        System.out.println("\nLoop forward: ");
//        while (itBeg.hasNext()){
//            System.out.println(itBeg.next());
//        }
//
//        System.out.println("\nLoop backward: ");
//        while (itBeg.hasPrevious()){
//            System.out.println(itBeg.previous());
//        }
//
//        ListIterator<String> itIndex = list.listIterator(4);
//        System.out.println("\nLoop from index: ");
//        while (itIndex.hasNext()){
//            System.out.println(itIndex.next());
//        }
//
//        Iterator<String> itDesc = list.descendingIterator();
//        System.out.println("\nLoop with descending Iterator");
//        while (itDesc.hasNext()){
//            System.out.println(itDesc.next());
//        }
//        itIndex.set("6");
//        itIndex.add("7");
//        Collections.sort(list);
//        System.out.println("\nSorted List:");
//        for (String string : list) {
//            System.out.println(string);
//        }
//        task1();
//        task2();
        task3();

    }

    //Task1
    //Сгенерируйте 10 случайных чисел в диапазоне от 1 до 100 и поместите их в массив,
    // поместите
    //числа больше или равные 10 в массив в набор списков и распечатайте их на консоли.
    public static void task1() {
        ArrayList<Integer> listBigger10 = new ArrayList<>();
        ArrayList<Integer> listLess10 = new ArrayList<>();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
            if (array[i] >= 10) {
                listBigger10.add(array[i]);
            }
            if (array[i] < 10) {
                listLess10.add(array[i]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
        Iterator<Integer> iterator = listBigger10.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        Iterator<Integer> iter = listLess10.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

    }

    //Task2
    //Определите метод listTest (ArrayList al, Integer s), который требует возврата индекса
    //первого вхождения s в al и возврата -1, если s не появился.
    public static void task2() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(4);
        System.out.println(listTest(numbers, 2));
    }

    public static int listTest(ArrayList<Integer> al, Integer s) {
        return al.indexOf(s);
    }

    //Task3
    //Известный массив хранит пакет номеров QQ. Самый длинный номер QQ состоит из 11 цифр,
    //а самый короткий - из 5 цифр
    //String [] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933" }.
    //Сохраните все числа qq в массиве в LinkedList, удалите повторяющиеся элементы в списке и
    //распечатайте все элементы в списке с помощью итератора и расширенного цикла for.
    public static void task3() {
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        LinkedList<String> elements = new LinkedList<>();
        elements.addAll(List.of(strs));
        System.out.println(elements);
        for (int i = 0; i < elements.size(); i++) {
            if(elements.indexOf(elements.get(i)) != elements.lastIndexOf(elements.get(i))){
                elements.remove(elements.get(i));
            }
        }
        System.out.println(elements);

    }

}