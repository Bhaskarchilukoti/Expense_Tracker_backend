package Ts.JavaIn.service;

import Ts.JavaIn.model.AppUser;
import Ts.JavaIn.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {

    private final UserRepository userRepository;

    // Constructor injection
    public AdminServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<AppUser> getAllUsers() {
        return userRepository.findAll();
    }
}

