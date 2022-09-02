package utils;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import java.util.UUID;

public class Utils {
 public static String  getUUid(){
   return UUID.randomUUID().toString();
 }

 public static void main(String[] args) {
  System.out.println(getUUid());
 }
}
