package com.flashdin.apidoc.repositories;

public interface CalculatorRepository {

    long add(Long a, Long b);
    long subtract(Long a, Long b);
    long multiply(Long a, Long b);
    long divide(Long a, Long b);
    long mod(Long a, Long b);

}
