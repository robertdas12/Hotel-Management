package com.user.globalException;

public class ResourceNotFoundException extends RuntimeException{

      ResourceNotFoundException(){
           super("resource not found");
      }


      public ResourceNotFoundException(String message){
          super(message);
      }
}
