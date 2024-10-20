package com.hotel.service;

import com.hotel.entity.Hotel;
import com.hotel.exception.ResourceNotFound;
import com.hotel.repository.HotelRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class HotelServiceImpl implements HotelService{

  private HotelRepo hotelRepo;


  public HotelServiceImpl(HotelRepo hotelRepo) {
    this.hotelRepo = hotelRepo;
  }

  @Override
  public Hotel createHotel(Hotel hotel) {
    String id = UUID.randomUUID().toString();
    hotel.setHoteld(id);
    return this.hotelRepo.save(hotel);
  }

  @Override
  public List<Hotel> getAllHotel() {
    return  this.hotelRepo.findAll();
  }

  @Override
  public Hotel getHotelById(String id) {
    return this.hotelRepo.findById(id).orElseThrow(()->new ResourceNotFound("the id which you have provide does not match, please provide the correct id"));
  }

  @Override
  public Hotel updateHotel(Hotel hotel) {
    return null;
  }
}
