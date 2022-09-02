/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import model.Center;
import model.Slot;
import model.User;
import model.WorkoutType;
import repository.*;
import service.*;
import service.serviceImpl.*;

import java.util.Arrays;
import java.util.List;

import static utils.Utils.getUUid;

public class Driver {

    public static void main(String[] args) {


        //initialize all repo
        UserRepository ur = new UserRepository();
        SlotRepository sr = new SlotRepository();
        CenterRepository cr = new CenterRepository();
        WorkoutRepository wr = new WorkoutRepository();
        BookingRepository br = new BookingRepository();

        //intiliaze all service
        UserService userService = new UserServiceImpl();
        CenterService centerService = new CenterServiceImpl();
        BookingService bookingService = new BookingServiceImpl();
        SlotService slotService = new SlotServiceImpl();
        WorkoutTypeService workoutTypeService = new WorkoutTypeServiceImpl();

        userService.addUser("naman", ur);
        userService.addUser("qwerty", ur);
        userService.addUser("abcd", ur);
//        for (User user : ur.getUserList()) {
//            System.out.println(user.getName()+" "+user.getUserId());
//        }
        workoutTypeService.addWorkoutType("cardio", wr);
        workoutTypeService.addWorkoutType("Weights", wr);
//        for(WorkoutType workoutType:wr.getWorkoutTypeList()) System.out.println(workoutType.getWorkoutType());
////Koramangala slots
        String slot1 = slotService.addSlot("6AM", workoutTypeService.getWorkoutType("cardio", wr), 10, sr);
        String slot2 = slotService.addSlot("7AM", workoutTypeService.getWorkoutType("cardio", wr), 10, sr);
        String slot3 = slotService.addSlot("8AM", workoutTypeService.getWorkoutType("cardio", wr), 10, sr);
        String slot4 = slotService.addSlot("6PM", workoutTypeService.getWorkoutType("Weights", wr), 10, sr);
        String slot5 = slotService.addSlot("7PM", workoutTypeService.getWorkoutType("Weights", wr), 10, sr);
        String slot6 = slotService.addSlot("8PM", workoutTypeService.getWorkoutType("Weights", wr), 10, sr);
//
//        for(Slot slot:sr.getSlotList()) System.out.println(slot.getTime()+" "+slot.getTotalNumberAllowed()+" "+slot.getBookedNumber()+" "+slot.getWorkoutType().getWorkoutType());

        List<String> slotList = Arrays.asList(slot1, slot6, slot5, slot4, slot3, slot2);
        centerService.addCenter("Koramangala", slotList, cr);
        bookingService.bookASlot("naman",slot6,"Koramangala",br,cr,ur,sr);
//        for(Center center:cr.getCenterList()) System.out.println(center.getName());
//        //Koramangala slots
         slot1 = slotService.addSlot("6AM", workoutTypeService.getWorkoutType("cardio", wr), 10, sr);
         slot2 = slotService.addSlot("7AM", workoutTypeService.getWorkoutType("cardio", wr), 10, sr);
         slot3 = slotService.addSlot("8AM", workoutTypeService.getWorkoutType("cardio", wr), 10, sr);
         slot4 = slotService.addSlot("6PM", workoutTypeService.getWorkoutType("Weights", wr), 10, sr);
         slot5 = slotService.addSlot("7PM", workoutTypeService.getWorkoutType("Weights", wr), 10, sr);
         slot6 = slotService.addSlot("8PM", workoutTypeService.getWorkoutType("Weights", wr), 10, sr);
        List<String> slotList2 = Arrays.asList(slot1, slot6, slot5, slot4, slot3, slot2);
        centerService.addCenter("Bellandur", slotList2, cr);
//
//
//        bookingService.bookASlot("naman",slot2,"Bellandur",br,cr,ur,sr);
////        System.out.println(br.getUserSlotBooking());
////        System.out.println(ur.getUserList());
//

        bookingService.bookASlot("naman",slot6,"Bellandur",br,cr,ur,sr);
        bookingService.bookASlot("naman",slot5,"Bellandur",br,cr,ur,sr);
//        centerService.getAvailableSlots("Bellandur",workoutTypeService.getWorkoutType("Weights",wr),cr,sr).forEach(x->{
//            System.out.println(x.getTime()+" "+x.getTotalNumberAllowed()+" "+x.getBookedNumber());
//        });
        bookingService.getUserSlots("naman",br,cr,ur,sr);
//
////        System.out.println(ur.getUserList()+"\n"+cr.getCenterList()+"\n"+sr.getSlotList()+"\n"+wr.getWorkoutTypeList());


    }


}
