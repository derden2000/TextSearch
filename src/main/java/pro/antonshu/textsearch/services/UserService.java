package pro.antonshu.textsearch.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import pro.antonshu.textsearch.entities.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    User findByPhone(String phone);

    User findById(Long id);

    boolean isUserExist(String phone);

    List<User> getAllUsers();

    User regNewUser(User user);

    User save(User user);

    void createPasswordResetTokenForUser(User user, String token);

    void changeUserPassword(User user, String newPassword);
}
