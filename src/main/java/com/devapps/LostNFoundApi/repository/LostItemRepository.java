package com.devapps.LostNFoundApi.repository;

import com.devapps.LostNFoundApi.model.LostItem;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LostItemRepository extends JpaRepository<LostItem, Long> {
    public List<LostItem> findByPostedBy(String postedBy);

    public Optional<LostItem> findById(long lost_id);
}
