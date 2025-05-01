package com.xable.scanner.controller;


import com.xable.scanner.model.BarcodeData;
import com.xable.scanner.repository.BarcodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/barcodes")
@CrossOrigin(origins = "*")
// Use your React dev server port
public class BarcodeController {

    @Autowired
    private BarcodeRepository barcodeRepository;

    @PostMapping
    public BarcodeData saveBarcode(@RequestBody BarcodeData barcodeData) {
        return barcodeRepository.save(barcodeData);
    }

    @GetMapping
    public List<BarcodeData> getAllBarcodes() {
        return barcodeRepository.findAll();
    }
}
