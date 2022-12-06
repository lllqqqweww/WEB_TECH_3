package com.lllllll.server.service.Impl;

import com.lllllll.entity.Response;
import com.lllllll.entity.StudentCase;
import com.lllllll.entity.User;
import com.lllllll.server.DAO.ServerDAO;
import com.lllllll.server.DAO.ServerDAOFactory;
import com.lllllll.server.service.ServerService;

import java.util.List;

public class ServerServiceImpl implements ServerService {

    @Override
    public Response getStudentCases() {
        ServerDAOFactory factory = ServerDAOFactory.getInstance();
        ServerDAO serverDAO = factory.getServerDAO();
        return serverDAO.getStudentCases();
    }

    @Override
    public Response editStudentCase(StudentCase studentCase) {
        return ServerDAOFactory.getInstance().getServerDAO().editStudentCase(studentCase);
    }

    @Override
    public Response createStudentCase(StudentCase studentCase) {
        return ServerDAOFactory.getInstance().getServerDAO().createStudentCase(studentCase);
    }

    @Override
    public Response getStudentCaseById(String caseId) {
        return ServerDAOFactory.getInstance().getServerDAO().getStudentCaseById(caseId);
    }

    @Override
    public Response login(User user) {
        ServerDAOFactory factory = ServerDAOFactory.getInstance();
        ServerDAO serverDAO = factory.getServerDAO();
        return serverDAO.login(user);
    }

    @Override
    public Response signIn(User user) {
        return ServerDAOFactory.getInstance().getServerDAO().signIn(user);
    }

    @Override
    public Response getUsers() {
        return ServerDAOFactory.getInstance().getServerDAO().getUsers();
    }

    @Override
    public void saveStudentCases(List<StudentCase> list) {
        ServerDAOFactory.getInstance().getServerDAO().saveStudentCases(list);
    }

    @Override
    public void saveUsersList(List<User> list) {
        ServerDAOFactory.getInstance().getServerDAO().saveUsersList(list);
    }
}
