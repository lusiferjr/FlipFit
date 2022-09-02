package service.serviceImpl;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import model.WorkoutType;
import repository.WorkoutRepository;
import service.WorkoutTypeService;

public class WorkoutTypeServiceImpl implements WorkoutTypeService {
    @Override
    public void addWorkoutType(String workoutType, WorkoutRepository wr) {
        WorkoutType workoutType1=new WorkoutType(workoutType);
        wr.addWorkoutType(workoutType1);
    }

    @Override
    public WorkoutType getWorkoutType(String workoutType, WorkoutRepository wr) {
        return wr.getWorkout(workoutType);
    }
}
