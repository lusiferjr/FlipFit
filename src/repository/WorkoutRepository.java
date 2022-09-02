package repository;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import com.sun.corba.se.spi.orbutil.threadpool.Work;
import model.User;
import model.WorkoutType;

import java.util.ArrayList;
import java.util.List;

public class WorkoutRepository {
    List<WorkoutType> workoutTypeList;

    public WorkoutRepository() {
        this.workoutTypeList = new ArrayList<>();
    }

    public List<WorkoutType> getWorkoutTypeList() {
        return workoutTypeList;
    }

    public void setWorkoutTypeList(List<WorkoutType> workoutTypeList) {
        this.workoutTypeList = workoutTypeList;
    }

    public void addWorkoutType(WorkoutType workoutType) {
        this.workoutTypeList.add(workoutType);
    }

    public WorkoutType getWorkout(String workoutName) {
        return this.workoutTypeList.parallelStream().filter(x -> x.getWorkoutType().equalsIgnoreCase(workoutName)).findAny().orElse(null);
    }

}
