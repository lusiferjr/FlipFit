package repository;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import model.Center;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class CenterRepository {
    List<Center> centerList;

    public List<Center> getCenterList() {
        return centerList;
    }

    public void setCenterList(List<Center> centerList) {
        this.centerList = centerList;
    }

    public CenterRepository() {
        this.centerList = new ArrayList<>();
    }
    public void addCenter(Center center){
        this.centerList.add(center);
    }
    public Center getCenter(String centerId){
        return this.centerList.parallelStream().filter(x->x.getCenterId().equalsIgnoreCase(centerId)).findAny().orElse(null);
    }
    public Center getCenterByName(String centerName){
        return this.centerList.parallelStream().filter(x->x.getName().equalsIgnoreCase(centerName)).findAny().orElse(null);
    }
    public void deleteUser(String centerId){
        Center center=getCenter(centerId);
        this.centerList.remove(center);
    }
}
