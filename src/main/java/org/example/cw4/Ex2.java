package org.example.cw4;

import java.util.LinkedList;

/**
 * 2. Построить однонаправленный список целых чисел.
 * Найти сумму четных элементов списка.
 */
public class Ex2 {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        for(int i = 0; i<6;i++){
            intList.add(i);
        }

        int sum = 0;
        for(Integer item : intList){
            if(item % 2 == 0) sum+= item;
        }
        System.out.println(sum);
    }
}
