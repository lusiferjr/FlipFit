package repository;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import dto.CenterSlotDto;
import model.Center;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingRepository {
    private Map<String, List<CenterSlotDto>> userSlotBooking;

    public BookingRepository() {
        this.userSlotBooking = new HashMap<>();
    }

    public Map<String, List<CenterSlotDto>> getUserSlotBooking() {
        return userSlotBooking;
    }

    public void setUserSlotBooking(Map<String, List<CenterSlotDto>> userSlotBooking) {
        this.userSlotBooking = userSlotBooking;
    }

    public void addBooking(String userId, String centerId, String slotId) {
        List<CenterSlotDto> userBookings = this.userSlotBooking.get(userId);
        if (userBookings == null || userBookings.size() < 1) {
            CenterSlotDto centerSlotDto = new CenterSlotDto(slotId, centerId);
            if (userBookings == null) userBookings = new ArrayList<>();
            userBookings.add(centerSlotDto);
            this.userSlotBooking.put(userId, userBookings);
        }
        else{
            CenterSlotDto centerSlotDto=userBookings.parallelStream().filter(x->x.getSlotId().equalsIgnoreCase(slotId)).findAny().orElse(null);
            if(centerSlotDto==null){
                centerSlotDto=new CenterSlotDto(slotId,centerId);
                userBookings.add(centerSlotDto);
                this.userSlotBooking.put(userId,userBookings);
            }
        }
    }
    public List<CenterSlotDto> getAllUserBooking(String userId){
        return this.userSlotBooking.get(userId);
    }


}
