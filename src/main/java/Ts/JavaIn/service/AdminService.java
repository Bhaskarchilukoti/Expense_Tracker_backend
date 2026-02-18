package Ts.JavaIn.service;

import Ts.JavaIn.model.AppUser;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AdminService {
    List<AppUser> getAllUsers();
}