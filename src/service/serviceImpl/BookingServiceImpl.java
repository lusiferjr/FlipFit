package service.serviceImpl;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import dto.CenterSlotDto;
import model.Slot;
import model.User;
import repository.BookingRepository;
import repository.CenterRepository;
import repository.SlotRepository;
import repository.UserRepository;
import service.BookingService;

import java.util.List;

public class BookingServiceImpl implements BookingService {
    @Override
    public void bookASlot(String userId, String slotId, String centerId, BookingRepository br, CenterRepository cr, UserRepository ur, SlotRepository sr) {
        Slot slot=sr.getSlot(slotId);
        slot.setBookedNumber(slot.getBookedNumber()+1);
        sr.updateSlot(slot);
        br.addBooking(ur.getUserByName(userId).getUserId(),cr.getCenterByName(centerId).getCenterId(),slotId);
    }

    @Override
    public void getUserSlots(String userId, BookingRepository br, CenterRepository cr, UserRepository ur, SlotRepository sr) {
        User user =ur.getUserByName(userId);
        List<CenterSlotDto> centerSlotDtoList=br.getAllUserBooking(user.getUserId());
        centerSlotDtoList.parallelStream().forEach(x->{
            System.out.println(cr.getCenter(x.getCenterId()).getName()+"---->"+sr.getSlot(x.getSlotId()).getTime());
        });
    }

}
