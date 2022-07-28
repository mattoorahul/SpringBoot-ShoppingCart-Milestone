package com.example.demo.form;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.demo.entity.Product;
import com.example.demo.model.CustomerInfo;

public class CustomerForm {
	
	private static final Logger LOGGER = LogManager.getLogger(CustomerForm.class);
	 
    private String name;
    private String address;
    private String email;
    private String phone;
 
    private boolean valid;
 
    public CustomerForm() {
 
    }
 
    public CustomerForm(CustomerInfo customerInfo) {
        if (customerInfo != null) {
            this.name = customerInfo.getName();
            this.address = customerInfo.getAddress();
            this.email = customerInfo.getEmail();
            this.phone = customerInfo.getPhone();
        }
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
 
    public boolean isValid() {
        return valid;
    }
 
    public void setValid(boolean valid) {
        this.valid = valid;
    }
 
}
