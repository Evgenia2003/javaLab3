package tech.reliab.course.ponomarevaea.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.reliab.course.ponomarevaea.bank.entity.CreditAccount;

public interface CreditAccountRepository extends JpaRepository<CreditAccount, Integer> {

    void deleteById(int id);
}
