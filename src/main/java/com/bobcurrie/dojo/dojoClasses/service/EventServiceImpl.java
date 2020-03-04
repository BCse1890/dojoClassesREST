package com.bobcurrie.dojo.dojoClasses.service;

import com.bobcurrie.dojo.dojoClasses.model.Event;
import com.bobcurrie.dojo.dojoClasses.model.Student;
import com.bobcurrie.dojo.dojoClasses.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class EventServiceImpl implements EventService{
    @Autowired
    EventRepository eventRepository;

    public Event addStudentToEvent(Event event, Student student) {
        Set<Student> event_studentList = event.getStudents();
        event_studentList.add(student);
        event.setStudents(event_studentList);
        return eventRepository.save(event);
    }
}

//    @Override
//    public Event saveEvent(Event event) {
//        return eventRepository.save(event);
//    }
//
//    @Override
//    public Event updateEvent(Event event) {
//        return eventRepository.save(event);
//    }
//
//    @Override
//    public void deleteEvent(Event event) {
//        eventRepository.delete(event);
//    }
//
//    @Override
//    public Event getEventById(Integer id) {
//        return eventRepository.findById(id).get();
//    }
//
//    @Override
//    public List<Event> getAllEvents() {
//        return eventRepository.findAll();
//    }
//}
