package tech.reliab.course.ponomarevaea.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.reliab.course.ponomarevaea.bank.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    void deleteById(int id);
}
