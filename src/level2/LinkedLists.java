package level2;

import java.util.*;

public class LinkedLists {
    public static void main(String[] args) {
        String[] animals = {"lion", "hippo"};
        List<String> list1= new LinkedList<String>();
        for(String x : animals) {
            list1.add(x);
        }
        String[] animals2 = {"cat","dog", "mouse","bee"};
        List<String> list2 = new LinkedList<String>();
        for(String y: animals2){
            list2.add(y);
        }

        list1.addAll(list2);
        list2 = null;
        printLists(list1);
        removeFromLists(list1,1,3);
        printLists(list1);
    }
    public static void printLists(List<String> list1){
        for(String all: list1){
            System.out.printf(" ya + "+all);
        }
        System.out.println("");
    }
    public static void removeFromLists(List<String> lst, int start, int end){
        lst.subList(start,end).clear();
    }
}
