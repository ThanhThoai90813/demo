package com.example.demo.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults (level = AccessLevel.PRIVATE)

public class UserUpdateRequest {
    String password;
    String firstName;
    String lastName;
    LocalDate dob;
    String email;
    String phone;
    String address;
    String city;
    String state;
    String country;
    String zip;
    String role;
}
