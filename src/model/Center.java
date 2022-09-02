package model;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import java.util.List;

public class Center {
 private String centerId;
 private String name;
 private List<String> availableSlots;

 public Center(String centerId, String name, List<String> availableSlots) {
  this.centerId = centerId;
  this.name = name;
  this.availableSlots = availableSlots;
 }

 public String getCenterId() {
  return centerId;
 }

 public void setCenterId(String centerId) {
  this.centerId = centerId;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public List<String> getAvailableSlots() {
  return availableSlots;
 }

 public void setAvailableSlots(List<String> availableSlots) {
  this.availableSlots = availableSlots;
 }

 @Override
 public String toString() {
  return "Center{" +
          "centerId='" + centerId + '\'' +
          ", name='" + name + '\'' +
          ", availableSlots=" + availableSlots +
          '}';
 }
}
