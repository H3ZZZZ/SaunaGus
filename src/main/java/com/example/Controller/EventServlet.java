package com.example.Controller;

import Models.Customer;
import Models.Event;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "EventServlet", value = "/EventServlet")
public class EventServlet extends HttpServlet {
    private String message;
    private ArrayList<Event> eventArrayList = new ArrayList<>();

    public void init() {
        message = "Hello World!";
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void createEvent(LocalDate date, String time, Boolean dayAvaiable, int slots, int phoneNumber, String location, String gusMester, String fyrmester, ArrayList<Customer> customerArrayList, int eventID) {
        Event event =  new Event(date,  time,  dayAvaiable,  slots,  phoneNumber,  location,  gusMester,  fyrmester,customerArrayList, eventID);
        for (Event events : eventArrayList) {
            if(event.getEventID() != events.getEventID()){
                eventArrayList.add(event);
            }else {
                System.out.println("Failed to create event, Provide a new eventID");
            }
        }
    }

    public int getEventID(Event event) {
        return event.getEventID();
    }
    private void createEvents() {
        LocalDate date1 = LocalDate.of(2022, 3, 28); // skal hentes fra frontend

        //createEvent(date1, "20:00", true, 10, 55555555, "Refshael øen", "Sebastian Larvad", "Morten Larvad",  , 1);
    }
    public void destroy() {
    }
}