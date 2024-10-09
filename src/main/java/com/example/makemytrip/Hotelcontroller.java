package com.example.makemytrip;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Hotelcontroller {

    @GetMapping("/hotel")
    public String getData() {
        return "Please book hotel from MMT, 80% discount in South India";
    }


    @PutMapping("/hotel/{hotelId}")
    public String updateHotel(@PathVariable String hotelId, @RequestParam String status) {
        return "Hotel with ID: " + hotelId + " is now " + status;
    }
}

