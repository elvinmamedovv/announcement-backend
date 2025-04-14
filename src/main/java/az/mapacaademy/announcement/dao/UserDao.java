package az.mapacaademy.announcement.dao;

import az.mapacaademy.announcement.entity.User;

import java.util.Optional;

public interface UserDao {
    User save(User user);
    Optional<User> findById(Long id);
    void delete(Long id);

}
