package service;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import repository.BookingRepository;
import repository.CenterRepository;
import repository.SlotRepository;
import repository.UserRepository;

public interface BookingService {
    public void bookASlot(String userId, String slotId, String centerId, BookingRepository br, CenterRepository cr, UserRepository ur, SlotRepository sr);
    public void getUserSlots(String userId,BookingRepository br, CenterRepository cr, UserRepository ur, SlotRepository sr);
}
