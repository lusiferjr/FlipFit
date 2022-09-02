package service;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import model.WorkoutType;
import repository.WorkoutRepository;

public interface WorkoutTypeService {
    public void addWorkoutType(String workoutType, WorkoutRepository wr);
    public WorkoutType getWorkoutType(String workoutType,WorkoutRepository wr);
}
