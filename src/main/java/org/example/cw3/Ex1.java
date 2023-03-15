package org.example.cw3;

import org.example.cw3.model.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1.	Даны сведения об экспортируемых товарах: указывается наименование товара, страна, экспортирующая
 * товар, и объем поставляемой партии в штуках. Найти страны, которые экспортируют
 * данный(введенный с кл-ы) товар, и общий объем его экспорта.
 */
public class Ex1 {
    public static void main(String[] args) {
        Items items1 = new Items("qwe1", "asd1", 1.);
        Items items2 = new Items("qwe2", "asd2", 2.);
        Items items3 = new Items("qwe1", "asd3", 3.);
        Items items4 = new Items("qwe2", "asd4", 4.);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);

        Scanner sc = new Scanner(System.in);
        String searchName = sc.nextLine();
        int sumVolume = 0;
        List<String> country = new ArrayList<>();

        for (int i = 0; i < itemsList.size(); i++){
            if(itemsList.get(i).getName().equals(searchName)){
                country.add(itemsList.get(i).getCountry());
                sumVolume += itemsList.get(i).getVolume();
            }
        }
        System.out.println(sumVolume);
        System.out.println(country);
    }
}
