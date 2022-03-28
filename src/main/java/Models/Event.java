package Models;

import java.util.ArrayList;
import java.util.Date;

public class Event {
        private Date date;
        private Boolean dayAvaiable;
        private int slots;
        private int phoneNumber;
        private String location;
        private String GusMester;
        private String Fyrmester;
        private ArrayList<Customer> customerArrayList;
        private int eventID;

    public int getEventID() {
        return eventID;
    }

    public Event(Date date , int slots, int phoneNumber, String location, String gusMester, String fyrmester, ArrayList<Customer> customerArrayList, int eventID) {
        this.date = date;
        this.slots = slots;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.GusMester = gusMester;
        this.Fyrmester = fyrmester;
        this.customerArrayList = customerArrayList;
        this.eventID = eventID;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public void addCustomerToEvent(Customer customer) {
        this.customerArrayList.add(customer);
    }


}
