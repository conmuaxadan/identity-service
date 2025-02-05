package com.raindrop.identity_service.mapper;

import com.raindrop.identity_service.dto.request.UserRequest;
import com.raindrop.identity_service.dto.response.UserResponse;
import com.raindrop.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public interface IUserMapper {
    User toUser(UserRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserRequest request);
}
