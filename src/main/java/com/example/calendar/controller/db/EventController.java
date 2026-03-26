package com.example.calendar.controller.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.calendar.entity.Event;
import com.example.calendar.projection.EventProjection;
import com.example.calendar.repository.EventRepository;

@RestController
@RequestMapping("/api/event")
public class EventController {
    
    @Autowired
    private EventRepository rep;

    @GetMapping("/")
    public ResponseEntity<List<Event>> getAll(){
        return ResponseEntity.ok(rep.findAll());
    }

    @GetMapping("/display")
    public ResponseEntity<List<EventProjection>> getEventsDisplay(){
        return ResponseEntity.ok(rep.getEventsDisplay());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Event> getById(@PathVariable Long id){
        Optional<Event> found = rep.findById(id);
        if (found.isPresent()) return ResponseEntity.ok(found.get());
        return ResponseEntity.status(404).body(null);
    }

    @GetMapping("/display/{id}")
    public ResponseEntity<EventProjection> getEventsDisplayById(@PathVariable Long id){
        Optional<EventProjection> found = rep.getEventsDisplayById(id);
        if (found.isPresent()) return ResponseEntity.ok(found.get());
        return ResponseEntity.status(404).body(null);
    }

    @PostMapping("/")
    public ResponseEntity<Event> addEvent(@RequestBody Event event){

        if (event.getSport().getId().equals(event.getAwayTeam().getSport().getId()) == false
        || event.getSport().getId().equals(event.getHomeTeam().getSport().getId()) == false
        || event.getSport().getId().equals(event.getCompetition().getSport().getId()) == false
        || event.getHomeTeam().getId().equals(event.getAwayTeam().getId().longValue()))
            return ResponseEntity.badRequest().body(event);

        Event e =  rep.save(event);
        return ResponseEntity.ok(e);
    }
}
