package com.flashdin.apidoc.services;

import com.flashdin.apidoc.repositories.CalculatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Autowired
    private CalculatorRepository calculatorRepository;

    @Override
    public long add(Long a, Long b) {
        a = a == null ? 0 : a;
        b = b == null ? 0 : b;
        return calculatorRepository.add(a, b);
    }

    @Override
    public long subtract(Long a, Long b) {
        a = a == null ? 0 : a;
        b = b == null ? 0 : b;
        return calculatorRepository.subtract(a, b);
    }

    @Override
    public long multiply(Long a, Long b) {
        a = a == null ? 0 : a;
        b = b == null ? 0 : b;
        return calculatorRepository.multiply(a, b);
    }

    @Override
    public long divide(Long a, Long b) {
        a = a == null ? 0 : a;
        b = b == null ? 0 : b;
        return calculatorRepository.divide(a, b);
    }

    @Override
    public long mod(Long a, Long b) {
        a = a == null ? 0 : a;
        b = b == null ? 0 : b;
        return calculatorRepository.mod(a, b);
    }
}
