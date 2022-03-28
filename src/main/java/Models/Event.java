package Models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Event {
    private LocalDate date;
    private String time;
    private Boolean dayAvaiable;
    private int slots;
    private int phoneNumber;
    private String location;
    private String GusMester;
    private String Fyrmester;
    private int eventID;
    private ArrayList<Customer> customerArrayList;


    public Event(LocalDate date, String time, Boolean dayAvaiable, int slots, int phoneNumber, String location, String gusMester, String fyrmester, ArrayList<Customer> customerArrayList, int eventID) {
        this.date = date;
        this.time = time;
        this.dayAvaiable = dayAvaiable;
        this.slots = slots;
        this.phoneNumber = phoneNumber;
        this.location = location;
        GusMester = gusMester;
        Fyrmester = fyrmester;
        this.customerArrayList = customerArrayList;
        this.eventID = eventID;
    }

    public int getEventID() {
        return eventID;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public void addCustomerToEvent(Customer customer) {
        this.customerArrayList.add(customer);
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }


}
