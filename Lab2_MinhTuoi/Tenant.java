package models;

import java.util.ArrayList;

public class Tenant {
    private User user;
    private ArrayList<User> listOfContract;
    public Tenant(ArrayList<User> listOfContract) {
        this.listOfContract = new ArrayList<>();
    }
    public void requestCreateRentalContract(User newUser){
        listOfContract.add(newUser);
    }
    public void requestTerminateRentalContract(User user){
        listOfContract.remove(user);
    }
}
