package dto;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

public class CenterSlotDto {
 String slotId;
 String centerId;

 public CenterSlotDto(String slotId, String centerId) {
  this.slotId = slotId;
  this.centerId = centerId;
 }

 public String getSlotId() {
  return slotId;
 }

 public void setSlotId(String slotId) {
  this.slotId = slotId;
 }

 public String getCenterId() {
  return centerId;
 }

 public void setCenterId(String centerId) {
  this.centerId = centerId;
 }
}
