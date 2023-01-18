package com.crearly.mssavetravel.service;

import com.crearly.mssavetravel.entity.Travel;

import java.util.Map;

public interface ITravelService {

    Map<String, String > saveTravel(Travel travel);

}
