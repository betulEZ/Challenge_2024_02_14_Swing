package com.example.challenge_2024_02_14_swing.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class Controller {
    List<Message> messages = new ArrayList<>();

    public Controller() {
        messages.add(new Message("1", "John", "Hello World"));
        messages.add(new Message("2", "Jane", "Hi there"));
    }

    @GetMapping
    public List<Message> getMessages() {
        return messages;
    }
    @PostMapping
    public void addMessage(@RequestBody Message message){
        messages.add(message);
    }

    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable String id){
        messages.removeIf(message -> message.getId().equals(id));
    }

//    @PostMapping
//    public Message postMessage(@RequestBody String id,
//                               @RequestBody String name,
//                               @RequestBody String message) {
//        Message newMessage = new Message(id, name, message);
//        messages.add(newMessage);
//        return newMessage;
//    }
}
