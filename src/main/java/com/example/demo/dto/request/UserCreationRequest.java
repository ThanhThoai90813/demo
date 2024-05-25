package com.example.demo.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE) //mac dinh la private het
public class UserCreationRequest {
    @Size(min = 3, message = "USERNAME_INVAILD")
    String username;

    //validation
    @Size(min = 8, max = 20, message = "PASSWORD_INVAILD")
    String password;
    String firstName;
    String lastName;
    LocalDate dob;

}
