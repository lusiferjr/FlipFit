package service.serviceImpl;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import model.Center;
import model.Slot;
import model.WorkoutType;
import repository.CenterRepository;
import repository.SlotRepository;
import service.CenterService;

import java.util.List;
import java.util.stream.Collectors;

import static utils.Utils.getUUid;

public class CenterServiceImpl implements CenterService {

    @Override
    public void addCenter(String name, List<String> slots, CenterRepository cr) {
        Center center =new Center(getUUid(),name,slots);
        cr.addCenter(center);
    }

    @Override
    public List<Slot> getAvailableSlots(String centerName, WorkoutType workoutType, CenterRepository cr, SlotRepository sr) {
        Center center=cr.getCenterByName(centerName);
        List<String> slotIdList=center.getAvailableSlots();
        List<Slot> slotList=slotIdList.parallelStream().map(x-> sr.getSlot(x)).filter(x-> x.getWorkoutType().getWorkoutType().equalsIgnoreCase(workoutType.getWorkoutType()) && x.getBookedNumber() < x.getTotalNumberAllowed()).collect(Collectors.toList());
        return slotList;
    }

}
