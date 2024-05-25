package com.example.demo.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE) //mac dinh la private het
public class AuthenticationResponse {
    String token;
    boolean authenticated; //neu true thi user cung cấp đúng username &pass
}
