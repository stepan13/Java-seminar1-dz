package org.example.cw4;

import java.util.LinkedList;

public class Ex3 {
    /**
     * 3. Заменить некратные 3 элементы списка, суммой нечетных элементов.
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        for(int i = 0; i<6;i++){
            intList.add(i);
        }
        System.out.println(intList);
        int sumOdd = 0;
        for(Integer item : intList){
            if(item %2 == 1){
                sumOdd += item;
            }
        }
        for(int i = 0; i < intList.size(); i++){
            Integer item = intList.get(i);
            if(item % 3 > 0){
                intList.set(i,sumOdd);
            }
        }
        System.out.println(intList);

    }
}
