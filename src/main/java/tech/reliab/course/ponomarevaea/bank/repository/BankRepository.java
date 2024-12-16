package tech.reliab.course.ponomarevaea.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.reliab.course.ponomarevaea.bank.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {

    void deleteById(int id);
}
