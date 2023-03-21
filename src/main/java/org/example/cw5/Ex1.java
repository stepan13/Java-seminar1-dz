package org.example.cw5;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        String inputString = "asdfsdsssssfasdf";
        Map<Character, Integer> letters = new HashMap();
        for(Character ch : inputString.toCharArray()){
            Integer elem = letters.get(ch);
            if(elem == null) elem = 0;
            elem++;
            letters.put(ch, elem);
        }
        System.out.println(letters);

    }
}
