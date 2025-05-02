package com.xable.scanner.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "barcodes")
public class BarcodeData {
    @Id
    private String id;
    private String code;
    private String productName;
    private double mrp;
    private double discount;
    private String weight;

    public BarcodeData() {}

    public BarcodeData(String code, String productName, double mrp, double discount, String weight) {
        this.code = code;
        this.productName = productName;
        this.mrp = mrp;
        this.discount = discount;
        this.weight = weight;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getMrp() {
        return mrp;
    }
    public void setMrp(double mrp) {
        this.mrp = mrp;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    
}
