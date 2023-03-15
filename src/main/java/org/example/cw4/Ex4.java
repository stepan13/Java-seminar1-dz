package org.example.cw4;

import java.util.LinkedList;

public class Ex4 {
    /**
     * 4. Построить однонаправленный список целых чисел.
     * Удалить отрицательные элементы списка.
     *
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(i * (i % 2 == 0 ? 1 : -1));
        }
        System.out.println(intList);

        LinkedList<Integer> removeList = new LinkedList();
        for (Integer item : intList){
            if(item < 0){
                removeList.add(item);
            }
        }
        for (Integer item : removeList){
            intList.remove(item);
        }
        System.out.println(intList);


    }
}
