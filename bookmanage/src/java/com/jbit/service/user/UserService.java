package com.jbit.service.user;

import com.jbit.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User login(String name, String userPassword);

}
