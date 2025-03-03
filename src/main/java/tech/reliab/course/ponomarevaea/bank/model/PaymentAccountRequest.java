package tech.reliab.course.ponomarevaea.bank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentAccountRequest {

    private int bankId;
    private int userId;
}
