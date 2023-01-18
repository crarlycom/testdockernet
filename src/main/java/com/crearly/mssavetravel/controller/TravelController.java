package com.crearly.mssavetravel.controller;

import com.crearly.mssavetravel.entity.Travel;
import com.crearly.mssavetravel.service.impl.TravelServiceImpl;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Log
@RestController
@RequestMapping("/save")
public class TravelController {

    @Autowired
    private TravelServiceImpl travelService;

    @PostMapping
    public ResponseEntity<Map<String, String>> save(@RequestBody Travel travel) {
        log.info("Call endpoint http://api.crearly.com/dev/travels/save on method post");
        return new ResponseEntity<>(travelService.saveTravel(travel), HttpStatus.CREATED);
    }

}
