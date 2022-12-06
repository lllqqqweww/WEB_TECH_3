package com.lllllll.client.main.view;

import com.lllllll.client.main.UseCases;

import java.io.IOException;
import java.util.Scanner;

public class GuestViewer {

    public static void view() throws IOException {
        int act = -1;
        Scanner in = new Scanner(System.in);

        while (act != 3) {
            printMenu();
            while(!in.hasNextInt()){
                in.next();
            }
            act = in.nextInt();
            switch (act) {
                case 1 -> UseCases.getStudentCases();
                case 2 -> UseCases.getStudentCaseById();
                default -> { return; }
            }
        }
    }

    private static void printMenu(){
        System.out.println("Choose activity");
        System.out.println("1. get all student cases");
        System.out.println("2. get student case by id");
        System.out.println("3. log out");
    }
}
