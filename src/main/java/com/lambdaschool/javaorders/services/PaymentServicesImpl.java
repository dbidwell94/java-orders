package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Payment;
import com.lambdaschool.javaorders.repositories.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServicesImpl implements PaymentServices {
    @Autowired
    private PaymentsRepository paymentRepos;

    @Override
    public Payment save(Payment payment) {
        return paymentRepos.save(payment);
    }
}
