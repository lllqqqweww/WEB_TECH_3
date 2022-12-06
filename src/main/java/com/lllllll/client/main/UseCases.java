package com.lllllll.client.main;

import com.lllllll.client.main.printInfo.PrintStudentCaseInfo;
import com.lllllll.client.main.printInfo.PrintUserInfo;
import com.lllllll.client.service.ClientService;
import com.lllllll.client.service.ClientServiceFactory;
import com.lllllll.entity.StudentCase;

import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;

public class UseCases {
    private static final ClientService service = ClientServiceFactory.getInstance().getClientService();

    public static void getStudentCases() throws IOException {
        PrintStudentCaseInfo.printAll(service.getStudentCases());
    }

    public static void editStudentCase() throws IOException {
        StudentCase studentCase = new StudentCase();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter id ");
        studentCase.setId(in.nextLine());

        inputStudentCase(studentCase, in);

        service.editStudentCase(studentCase);
    }

    private static void inputStudentCase(StudentCase studentCase, Scanner in) {
        System.out.println("Enter name ");
        studentCase.setName(in.nextLine());

        System.out.println("Enter surname");
        studentCase.setSurname(in.nextLine());

        System.out.println("Enter GPA");
        studentCase.setGPA(in.nextDouble());
        in.nextLine();

        System.out.println("Enter Speciality");
        studentCase.setSpeciality(in.nextLine());
    }

    public static void createStudentCase() throws IOException {
        StudentCase studentCase = new StudentCase();
        Scanner in = new Scanner(System.in);

        inputStudentCase(studentCase, in);

        studentCase.setId(UUID.randomUUID().toString());

        if (service.createStudentCase(studentCase)){
            System.out.println("Success");
        }
        else{
            System.out.println("Error");
        }
    }

    public static void getStudentCaseById() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter id ");
        String id = in.nextLine();

        StudentCase studentCase = service.getStudentCaseById(id);
        if (studentCase != null) {
            PrintStudentCaseInfo.printOne(studentCase);
        }
        else{
            System.out.println("Not found");
        }
    }

    public static void getUsers() throws IOException {
        PrintUserInfo.print(service.getUsers());
    }
}
