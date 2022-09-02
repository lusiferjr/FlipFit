package service;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import model.Slot;
import model.WorkoutType;
import repository.CenterRepository;
import repository.SlotRepository;
import repository.UserRepository;

import java.util.List;

public interface CenterService {
 public void addCenter(String name, List<String> slots, CenterRepository cr);
 public List<Slot> getAvailableSlots(String centerName, WorkoutType workoutType, CenterRepository cr, SlotRepository sr);

}
