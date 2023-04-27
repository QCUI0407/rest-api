package com.restpai.service;

import com.restpai.dto.UserDTO;
import com.restpai.utils.BaseResponseDTO;

public interface UserService {
    BaseResponseDTO registerAccount(UserDTO userDTO);
}