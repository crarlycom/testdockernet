package com.crearly.mssavetravel.service.impl;

import com.crearly.mssavetravel.entity.Travel;
import com.crearly.mssavetravel.repository.ITravelRepository;
import com.crearly.mssavetravel.service.ITravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TravelServiceImpl implements ITravelService {

    @Autowired
    private ITravelRepository travelRepository;

    @Override
    public Map<String, String> saveTravel(Travel travel) {
        Map<String, String> message = new HashMap<>();
        travelRepository.save(travel);
        message.put("message", String.format("Travel %s saved successfully", travel.getUrlTravel()));
        return message;
    }
}
