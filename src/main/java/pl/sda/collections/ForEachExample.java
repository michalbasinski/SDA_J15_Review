package pl.sda.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("TEST1");
        list.add("TEST2");
        list.add("TEST3");
        list.add("TEST4");
        list.add("TEST5");

        //wypisanie wartości listy/kolekcji wariant1 - foreach
        for (String value : list) {
            System.out.println(value);
        }

        //wypisanie wartości listy/kolekcji wariant2 - klasyczny
        for (int i = 0; i < list.size(); i++) {
            String value = list.get(i);
            System.out.println(value);
        }

        //wypisanie wartości listy/kolekcji wariant3 - StreamAPI/lambda
        list.forEach(x -> System.out.println(x));
        //ewentualnie tak - list.forEach(System.out::println);

        //filtrowanie kolekcji - lambda
        List<String> filteredlist = list.stream().filter(x -> !"TEST3".equals(x)).collect(Collectors.toList());

        //filtrowanie kolekcji - klasycznie
        List<String> elementsToRemove = new ArrayList<>();
        for (String element : list) {
            if ("TEST3".equals(element)) {
                elementsToRemove.add(element);
            }
        }
        list.removeAll(elementsToRemove);
    }
}
