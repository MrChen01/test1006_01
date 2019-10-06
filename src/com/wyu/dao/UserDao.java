package com.wyu.dao;

public interface UserDao {
    int findIdByName(String name);
    boolean login();

    boolean finisherror();
}
