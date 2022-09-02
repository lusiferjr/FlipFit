package service;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import model.Slot;
import model.WorkoutType;
import repository.SlotRepository;

public interface SlotService {
    public String addSlot(String time, WorkoutType workoutType,Integer totalCapacity, SlotRepository sr);
    public Slot getSlotById(String slotId,SlotRepository sr);
}
