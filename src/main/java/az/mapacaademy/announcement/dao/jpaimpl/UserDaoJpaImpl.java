package az.mapacaademy.announcement.dao.jpaimpl;

import az.mapacaademy.announcement.dao.UserDao;
import az.mapacaademy.announcement.entity.User;
import az.mapacaademy.announcement.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserDaoJpaImpl implements UserDao {
    private final UserRepository userRepository;
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);

    }
}
