package tech.reliab.course.ponomarevaea.bank.service;

import tech.reliab.course.ponomarevaea.bank.entity.BankOffice;
import tech.reliab.course.ponomarevaea.bank.model.BankOfficeRequest;

import java.util.List;

public interface BankOfficeService {

    BankOffice createBankOffice(BankOfficeRequest bankOfficeRequest);

    BankOffice getBankOfficeById(int id);

    BankOffice getBankDtoOfficeById(int id);

    List<BankOffice> getAllBankOffices();

    BankOffice updateBankOffice(int id, String name);

    void deleteBankAtm(int id);
}
