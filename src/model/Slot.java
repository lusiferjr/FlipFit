package model;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

public class Slot {
 private String slotId;
 private String time;
 private WorkoutType workoutType;
 private Integer totalNumberAllowed;
 private Integer bookedNumber;

 public Slot(String slotId, String time, WorkoutType workoutType, Integer totalNumberAllowed, Integer bookedNumber) {
  this.slotId = slotId;
  this.time = time;
  this.workoutType = workoutType;
  this.totalNumberAllowed = totalNumberAllowed;
  this.bookedNumber = bookedNumber;
 }

 public String getSlotId() {
  return slotId;
 }

 public void setSlotId(String slotId) {
  this.slotId = slotId;
 }

 public String getTime() {
  return time;
 }

 public void setTime(String time) {
  this.time = time;
 }

 public WorkoutType getWorkoutType() {
  return workoutType;
 }

 public void setWorkoutType(WorkoutType workoutType) {
  this.workoutType = workoutType;
 }

 public Integer getTotalNumberAllowed() {
  return totalNumberAllowed;
 }

 public void setTotalNumberAllowed(Integer totalNumberAllowed) {
  this.totalNumberAllowed = totalNumberAllowed;
 }

 public Integer getBookedNumber() {
  return bookedNumber;
 }

 public void setBookedNumber(Integer bookedNumber) {
  this.bookedNumber = bookedNumber;
 }

 @Override
 public String toString() {
  return "Slot{" +
          "slotId='" + slotId + '\'' +
          ", time='" + time + '\'' +
          ", workoutType=" + workoutType +
          ", totalNumberAllowed=" + totalNumberAllowed +
          ", bookedNumber=" + bookedNumber +
          '}';
 }
}
