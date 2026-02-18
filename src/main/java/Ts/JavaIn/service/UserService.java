package Ts.JavaIn.service;

import Ts.JavaIn.model.AppUser;

import java.util.Optional;

public interface UserService {
    AppUser saveUser(AppUser user);
    AppUser findByUsername(String username);
    Optional<AppUser> findById(Long id);
}
