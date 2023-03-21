package org.example.cw6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        Set<Integer> instSet1 = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> instSet2 = new HashSet<>(Arrays.asList(3,5,6,7));
        Set<Integer> intersection = new HashSet(instSet1);
        intersection.retainAll(instSet2);
        System.out.println(intersection);



    }
}
