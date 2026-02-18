package Ts.JavaIn.service;

import Ts.JavaIn.dto.AppUserDTO;
import Ts.JavaIn.dto.AuthDTO;
import Ts.JavaIn.dto.AuthResponseDTO;

public interface AuthService {
    AuthResponseDTO registerUser(AppUserDTO appUserDTO);
    AuthResponseDTO loginUser(AuthDTO authDTO);
}
