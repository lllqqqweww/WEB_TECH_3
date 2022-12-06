package com.lllllll.client.main.printInfo;

import com.lllllll.entity.StudentCase;

import java.util.List;

public class PrintStudentCaseInfo {

    public static void printAll(List<StudentCase> cases) {
        for (StudentCase studentCase: cases) {
            System.out.println(studentCase.toString());
        }
    }

    public static void printOne(StudentCase studentCase){
        System.out.println(studentCase.toString());
    }
}
