package model;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

public class User {
 private String userId;
 private  String name;



 public User(String userId, String name) {
  this.userId = userId;
  this.name = name;
 }

 public String getUserId() {
  return userId;
 }

 public void setUserId(String userId) {
  this.userId = userId;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 @Override
 public String toString() {
  return "User{" +
          "userId='" + userId + '\'' +
          ", name='" + name + '\'' +
          '}';
 }
}
