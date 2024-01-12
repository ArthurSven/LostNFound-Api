package com.devapps.LostNFoundApi.repository;

import com.devapps.LostNFoundApi.model.LostItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LostItemRepository extends JpaRepository<LostItem, Long> {

}
