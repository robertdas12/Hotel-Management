package com.hotel.service;

import com.hotel.HotelServiceApplication;
import com.hotel.entity.Hotel;

import java.util.List;

public interface HotelService {

     public Hotel  createHotel(Hotel hotel);
     public List<Hotel> getAllHotel();
     public Hotel getHotelById(String id);
     public Hotel updateHotel(Hotel hotel);
}
