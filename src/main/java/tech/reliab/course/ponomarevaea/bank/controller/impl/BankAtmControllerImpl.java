package tech.reliab.course.ponomarevaea.bank.controller.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.reliab.course.ponomarevaea.bank.entity.BankAtm;
import tech.reliab.course.ponomarevaea.bank.model.BankAtmRequest;
import tech.reliab.course.ponomarevaea.bank.service.BankAtmService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bank-atms")
public class BankAtmControllerImpl {

    private final BankAtmService bankAtmService;

    @PostMapping
    public ResponseEntity<BankAtm> createBankAtm(BankAtmRequest bankAtmRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bankAtmService.createBankAtm(bankAtmRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBankAtm(int id) {
        bankAtmService.deleteBankAtm(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<BankAtm> updateBankAtm(int id, String name) {
        return ResponseEntity.ok(bankAtmService.updateBankAtm(id, name));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BankAtm> getBankAtmById(int id) {
        return ResponseEntity.ok(bankAtmService.getBankAtmDtoById(id));
    }

    @GetMapping("/all-by-bank/{bankId}")
    public ResponseEntity<List<BankAtm>> getAllBankAtmByBankId(int bankId) {
        return ResponseEntity.ok(bankAtmService.getAllBankAtmsByBankId(bankId));
    }

    @GetMapping
    public ResponseEntity<List<BankAtm>> getAllBankAtms() {
        return ResponseEntity.ok(bankAtmService.getAllBankAtms());
    }
}
