package pro.antonshu.textsearch.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pro.antonshu.textsearch.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findOneByPhone(String phone);

    User findOneById(Long id);

    boolean existsByPhone(String phone);
}
