package service.serviceImpl;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import model.User;
import repository.UserRepository;
import service.UserService;

import static utils.Utils.getUUid;

public class UserServiceImpl implements UserService {

    @Override
    public void addUser(String name, UserRepository ur) {
        User user=new User(getUUid(),name);
        ur.addUser(user);
    }

}
