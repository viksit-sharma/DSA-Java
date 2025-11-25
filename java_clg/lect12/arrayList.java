package lect12;

import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(4);
        List.addFirst(1);
        List.add(2, 3);
        System.out.println(List);
    }
}
