package com.hendisantika.registration.service;

import com.hendisantika.registration.entity.User;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-account-registration
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-08
 * Time: 19:01
 */
public interface UserService {
    User findUserByEmail(String email);

    void saveUser(User user);
}
