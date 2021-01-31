package com.flashdin.apidoc.repositories;

public class CalculatorRepositoryImpl implements CalculatorRepository {
    @Override
    public long add(Long a, Long b) {
        return a + b;
    }

    @Override
    public long subtract(Long a, Long b) {
        return a - b;
    }

    @Override
    public long multiply(Long a, Long b) {
        return a * b;
    }

    @Override
    public long divide(Long a, Long b) {
        return a / b;
    }

    @Override
    public long mod(Long a, Long b) {
        return a % b;
    }
}
