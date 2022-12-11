package com.example.theatre.Avices;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MethodsBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("We are invoking "+method.getName()+ "() method now");
    }
}
