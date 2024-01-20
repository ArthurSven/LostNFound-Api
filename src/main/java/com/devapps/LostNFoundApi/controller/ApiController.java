package com.devapps.LostNFoundApi.controller;

import com.devapps.LostNFoundApi.model.LostItem;
import com.devapps.LostNFoundApi.repository.LostItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ApiController {

    @Autowired
    private LostItemRepository lostItemRepository;

    @GetMapping(value = "/")
    public String getPage() {
        return "Your Api is Running";
    }

    @GetMapping(value = "/lost-items")
    public List<LostItem> getLostItems() {
        return lostItemRepository.findAll();
    }

    @PostMapping(value = "/post-item")
    public String postItem(@RequestBody LostItem lostItem) {
        lostItemRepository.save(lostItem);
        return "Item has been posted";
    }

    @GetMapping("/lost-items/id/{lost_id}")
    public ResponseEntity<Optional<LostItem>> getLostItemsById(@PathVariable long lost_id) {
        Optional<LostItem> lostItems = lostItemRepository.findById(lost_id);
        if(lostItems.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(lostItems);
        }
    }


    @GetMapping("/lost-items/username/{postedBy}")
    public ResponseEntity<List<LostItem>> getLostItemsByUsername(@PathVariable String postedBy) {
        List<LostItem> lostItems = lostItemRepository.findByPostedBy(postedBy);
        if(lostItems.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(lostItems);
        }
    }
}
