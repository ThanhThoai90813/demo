package com.example.demo.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE) //mac dinh la private het
//nơi ngướời dùng cung cấp userName và password để đăng nhập
public class AuthenticationRequest {
    String username;
    String password;
}
