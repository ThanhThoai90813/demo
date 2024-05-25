package com.example.demo.mapper;

import com.example.demo.dto.request.UserCreationRequest;
import com.example.demo.dto.request.UserUpdateRequest;
import com.example.demo.dto.response.UserResponse;
import com.example.demo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
//    @Mapping(source = "firstName", target = "lastName") //gán tk kia cho tk này
//    @Mapping(source = "firstName", ignore = true)//bỏ tk kia thanh null
    UserResponse toUserResponse(User user);
}
