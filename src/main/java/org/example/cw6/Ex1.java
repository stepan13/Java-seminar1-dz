package org.example.cw6;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>(Arrays.asList(1,2,3,1,2,1,1));
        Set<Integer> setInt = new HashSet<>(listInt);
        System.out.println(100.* setInt.size() / listInt.size());
    }
}
