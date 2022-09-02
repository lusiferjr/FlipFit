package repository;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public UserRepository() {
        this.userList = new ArrayList<>();
    }


    //userFunctions

    public void addUser(User user) {
        this.userList.add(user);
    }

    public User getUser(String userId) {
        return this.userList.parallelStream().filter(x -> x.getUserId().equalsIgnoreCase(userId)).findAny().orElse(null);
    }

    public User getUserByName(String userName) {
        return this.userList.parallelStream().filter(x -> x.getName().equalsIgnoreCase(userName)).findAny().orElse(null);
    }

    public void deleteUser(String userId) {
        User user = getUser(userId);
        this.userList.remove(user);
    }

}
