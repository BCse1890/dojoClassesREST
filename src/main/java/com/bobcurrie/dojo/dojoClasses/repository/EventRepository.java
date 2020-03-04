package com.bobcurrie.dojo.dojoClasses.repository;

import com.bobcurrie.dojo.dojoClasses.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
