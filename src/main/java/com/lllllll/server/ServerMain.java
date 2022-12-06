package com.lllllll.server;

import com.lllllll.server.service.serverLauncher.Server;

import java.io.IOException;

public class ServerMain {
    public static void main(String[] args) throws IOException {
        Server server = new Server(8080);
        server.launchAndWait();


//        List<StudentCase> list = new ArrayList<>();
//        StudentCase s1 = new StudentCase("Vasya","Petrov",6.7,"POIT",UUID.randomUUID().toString());
//        list.add(s1);
//        StudentCase s2 = new StudentCase("Valentina","Petrova",6.7,"POIT",UUID.randomUUID().toString());
//        list.add(s2);
//        StudentCase s3 = new StudentCase("Vasya","Petrov",6.7,"POIT",UUID.randomUUID().toString());
//        list.add(s3);
//        StudentCase s4 = new StudentCase("Vasya","Petrov",6.7,"POIT",UUID.randomUUID().toString());
//        list.add(s4);
//
//
//
//        List<User> list1 = new ArrayList<>();
//        User u1 = new User("admin","admin".hashCode(), UserRole.ADMIN, UUID.randomUUID().toString());
//        list1.add(u1);
//
//        User u2 = new User("Svetlana","1234".hashCode(), UserRole.AUTHUSER,UUID.randomUUID().toString());
//        list1.add(u2);
//
//        User u3 = new User("Polina","flower".hashCode(), UserRole.AUTHUSER,UUID.randomUUID().toString());
//        list1.add(u3);
//
//        User u4 = new User("Stanislav","admin1234".hashCode(), UserRole.ADMIN,UUID.randomUUID().toString());
//        list1.add(u4);



    }
}
