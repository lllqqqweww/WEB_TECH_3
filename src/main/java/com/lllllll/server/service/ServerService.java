package com.lllllll.server.service;

import com.lllllll.entity.Response;
import com.lllllll.entity.StudentCase;
import com.lllllll.entity.User;

import java.util.List;

public interface ServerService {

    Response getStudentCases();

    Response editStudentCase(StudentCase studentCase);

    Response createStudentCase(StudentCase studentCase);

    Response getStudentCaseById(String caseId);

    Response login(User user);

    Response signIn(User user);

    Response getUsers();

    void saveStudentCases(List<StudentCase> list);

    void saveUsersList(List<User> list);


}
