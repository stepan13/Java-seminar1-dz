package org.example.cw2;

/**
 * 3)Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
 */
public class Ex3 {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 4, 2, 1, 12, 6};
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 2*arr[i+1]) count ++;
        }
        System.out.println(count);
    }
}
