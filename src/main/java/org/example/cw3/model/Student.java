package org.example.cw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * амилия студента, номер группы, размер стипендии,
 * баллы по 3 предметам
 */

@Data
@AllArgsConstructor
public class Student {
    private String surname;
    private int groupNumber;
    private int salary;
    private List<Integer> marks;

    public int getMarkSum(){
        int sum = 0;
        for(int value : this.marks){
            sum += value;
        }
        return sum;
    }
}
