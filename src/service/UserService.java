package service;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import repository.UserRepository;

public interface UserService {
    public void addUser(String name, UserRepository ur);
}
