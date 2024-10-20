package com.hotel.controller;

import com.hotel.entity.Hotel;
import com.hotel.service.HotelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

      private HotelService service;

  public HotelController(HotelService service) {
    this.service = service;
  }


  @PostMapping("/creteHotel")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
    Hotel hotel1 = this.service.createHotel(hotel);
    return   ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
  }

  @GetMapping("/getAllHotels")
   public  ResponseEntity<List<Hotel>> getAllHotels(){
    List<Hotel> allHotel = this.service.getAllHotel();
    return ResponseEntity.ok(allHotel);
  }


  @GetMapping("/getById/{id}")
   public  ResponseEntity<Hotel> getHotelById(@PathVariable String id){
    System.out.println(id + " id is ");
    Hotel hotelById = this.service.getHotelById(id);
    return  ResponseEntity.ok(hotelById);
  }
}
