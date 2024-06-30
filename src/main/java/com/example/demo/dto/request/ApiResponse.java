package com.example.demo.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse <T>{
     int code = 1000;
     int ok = 1;

     @Override
     protected Object clone() throws CloneNotSupportedException {
          return super.clone();
     }

     public String getMessage() {
          return message;
     }

     public int getOk() {
          return ok;
     }

     String message;
     T result;
}
