package com.bobcurrie.dojo.dojoClasses.service;

import com.bobcurrie.dojo.dojoClasses.model.Event;
import com.bobcurrie.dojo.dojoClasses.model.Student;

public interface EventService {

//    Event saveEvent(Event event);
//    Event updateEvent(Event event);
//    void deleteEvent(Event event);
//    Event getEventById(Integer id);
//    List<Event> getAllEvents();

    Event addStudentToEvent(Event event, Student student);
}
