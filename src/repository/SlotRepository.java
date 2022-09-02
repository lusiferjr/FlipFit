package repository;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import model.Slot;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class SlotRepository {
    List<Slot> slotList;

    public SlotRepository() {
        this.slotList = new ArrayList<>();
    }

    public List<Slot> getSlotList() {
        return slotList;
    }

    public void setSlotList(List<Slot> slotList) {
        this.slotList = slotList;
    }
    public void addSlot(Slot slot){
        this.slotList.add(slot);
    }
    public Slot getSlot(String slotId){
        return this.slotList.parallelStream().filter(x->x.getSlotId().equalsIgnoreCase(slotId)).findAny().orElse(null);
    }

    public void deleteSlot(String slotId){
        Slot slot=getSlot(slotId);
        if(slot!=null)
            this.slotList.remove(slot);
    }
    public void updateSlot(Slot slot){
        deleteSlot(slot.getSlotId());
        addSlot(slot);
    }
}
