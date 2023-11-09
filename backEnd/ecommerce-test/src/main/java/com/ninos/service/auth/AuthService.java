package com.ninos.service.auth;

import com.ninos.model.dto.JwtAuthResponse;
import com.ninos.model.dto.LoginDTO;
import com.ninos.model.dto.RegisterDTO;

public interface AuthService {

    String register(RegisterDTO registerDTO);
    JwtAuthResponse login(LoginDTO loginDTO);

}
