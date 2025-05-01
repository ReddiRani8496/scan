package com.xable.scanner.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "barcodes")
public class BarcodeData {
    @Id
    private String id;
    private String code;

    // Constructors
    public BarcodeData() {}
    public BarcodeData(String code) { this.code = code; }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
}

