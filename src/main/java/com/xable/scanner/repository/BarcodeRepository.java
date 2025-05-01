package com.xable.scanner.repository;


import com.xable.scanner.model.BarcodeData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BarcodeRepository extends MongoRepository<BarcodeData, String> {
    // No extra methods needed for simple CRUD
}
