package Phrase;
import java.util.*;
public class PhraseOMatic {
    public static void main(String[] args) {
      LinkedList array = new LinkedList();
      array.add("a");
      array.add("b");
      array.add("c");
      array.add("f");
      array.add("c");
      array.addFirst("F");
      array.addLast("L");
        System.out.println(array);
        array.removeFirstOccurrence("c");
        System.out.println(array);
        array.remove(0);
        System.out.println(array);

      LinkedHashMap<String, Double> planets = new LinkedHashMap<>();

// добавление элементов
      planets.put("Earth", new Double(6371));
      planets.put("A", new Double(2439.7));
      planets.put("Saturn", new Double(58232));
      planets.put("Neptune", new Double(24622));
      planets.put("Venus", new Double(6051.8));

// отображение множества, обратите внимание на порядок вывода
      System.out.println(planets);
      for (Map.Entry me : planets.entrySet()) {
        System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
      }


    }
    } // close inner class