package tech.reliab.course.ponomarevaea.bank.service;

import tech.reliab.course.ponomarevaea.bank.entity.BankAtm;
import tech.reliab.course.ponomarevaea.bank.model.BankAtmRequest;

import java.util.List;

public interface BankAtmService {
    BankAtm createBankAtm(BankAtmRequest bankAtmRequest);

    BankAtm getBankAtmById(int id);

    BankAtm getBankAtmDtoById(int id);

    List<BankAtm> getAllBankAtms();

    List<BankAtm> getAllBankAtmsByBankId(int bankId);

    BankAtm updateBankAtm(int id, String name);

    void deleteBankAtm(int id);
}
