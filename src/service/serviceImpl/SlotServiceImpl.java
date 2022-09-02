package service.serviceImpl;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import model.Slot;
import model.WorkoutType;
import repository.SlotRepository;
import service.SlotService;

import static utils.Utils.getUUid;

public class SlotServiceImpl implements SlotService {
    @Override
    public String addSlot(String time, WorkoutType workoutType, Integer totalCapacity, SlotRepository sr) {
        Slot slot=new Slot(getUUid(),time,workoutType,totalCapacity,0);
        sr.addSlot(slot);
        return slot.getSlotId();
    }

    @Override
    public Slot getSlotById(String slotId, SlotRepository sr) {
        return sr.getSlot(slotId);
    }
}
