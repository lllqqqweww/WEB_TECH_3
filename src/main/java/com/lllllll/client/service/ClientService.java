package com.lllllll.client.service;

import com.lllllll.entity.StudentCase;
import com.lllllll.entity.User;

import java.io.IOException;
import java.util.List;

public interface ClientService {
    List<StudentCase> getStudentCases() throws IOException;

    List<User> getUsers() throws IOException;

    boolean editStudentCase(StudentCase studentCase) throws IOException;

    boolean createStudentCase(StudentCase studentCase) throws IOException;

    StudentCase getStudentCaseById(String caseId) throws IOException;

    User login(User user) throws IOException;

    User signIn(User user) throws IOException;


}
