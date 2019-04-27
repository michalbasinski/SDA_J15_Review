package pl.sda.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {
        Map<String, String> dictionary = new LinkedHashMap<>();

        //dodanie elementu do mapy
        dictionary.put("KLUCZ", "WARTOŚĆ");

        //pobranie elementu z mapy
        String value = dictionary.get("KLUCZ");
        System.out.println("Wartość pobrana z mapy: " + value);

        dictionary.put("KLUCZ2", "WARTOŚĆ2");
        dictionary.put("KLUCZ3", "WARTOŚĆ3");
        dictionary.put("KLUCZ4", "WARTOŚĆ4");
        dictionary.put("KLUCZ5", "WARTOŚĆ4");
        dictionary.put("KLUCZ", "WARTOŚĆ423423");

        //iteracja po mapie wariant 1 - foreach na kolekcji keySet
        System.out.println("Iteracja po mapie wariant 1");
        for (String key : dictionary.keySet()) {
            String valueFromMap = dictionary.get(key);
            System.out.println(key + " " + valueFromMap);
        }

        //iteracja po mapie wariant 2 - foreach po map.entry
        System.out.println("Iteracja po mapie wariant 2");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //iteracja po mapie wariant 3 - streamAPI/lambda
        System.out.println("Iteracja po mapie wariant 3");
        dictionary.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        dictionary.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        dictionary.keySet().forEach(x -> System.out.println(x + " "+ dictionary.get(x)));


        //filtrowanie mapy wariant 1 - klasyczne
        //1. szukanie kluczy zawierających wartości, których nie chcemy
        Set<String> keysToRemove = new HashSet<>();
        for (Map.Entry entry : dictionary.entrySet()) {
            if ("WARTOŚĆ4".equals(entry.getValue())) {
                keysToRemove.add(entry.getKey().toString());
            }
        }
        //2. usuwanie z mapy wartości znajdujących się pod kluczami wyszukanymi w pkcie 1
        for (String keyToRemove : keysToRemove) {
            dictionary.remove(keyToRemove);
        }

        //filtrowanie mapy wariant 2 - lambda
        dictionary.entrySet().stream()
                .filter(x -> "WARTOŚĆ4".equals(x.getValue()))
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

    }

}
