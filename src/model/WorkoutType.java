package model;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

public class WorkoutType {
 private String workoutType;

 public WorkoutType(String workoutType) {
  this.workoutType = workoutType;
 }

 public String getWorkoutType() {
  return workoutType;
 }

 public void setWorkoutType(String workoutType) {
  this.workoutType = workoutType;
 }

 @Override
 public String toString() {
  return "WorkoutType{" +
          "workoutType='" + workoutType + '\'' +
          '}';
 }
}
