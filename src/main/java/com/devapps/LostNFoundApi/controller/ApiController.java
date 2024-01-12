package com.devapps.LostNFoundApi.controller;

import com.devapps.LostNFoundApi.model.LostItem;
import com.devapps.LostNFoundApi.repository.LostItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
