package com.bobcurrie.dojo.dojoClasses.controller;

import com.bobcurrie.dojo.dojoClasses.model.Event;
import com.bobcurrie.dojo.dojoClasses.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/events")
public class EventRestController {

    @Autowired
    EventRepository eventRepository;

    @GetMapping
    public List<Event> getEvents() {
        return eventRepository.findAll();
    }

    @PostMapping
    public Event saveEvent(@RequestBody Event event) {
        return eventRepository.save(event);
    }

    @PutMapping
    public Event updateEvent(@RequestBody Event event) {
        return eventRepository.save(event);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable("id") Integer id) {
        eventRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Event getEventById(@PathVariable("id") Integer id) {
        return eventRepository.findById(id).get();
    }

}
