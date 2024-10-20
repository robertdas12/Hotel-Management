package com.hotel.exception;

public class ResourceNotFound extends RuntimeException{

   public   ResourceNotFound(){
         super("resource not found");
      }

    public   ResourceNotFound(String message){
         super(message);
      }
}
