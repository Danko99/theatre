package com.example.theatre;

import com.example.theatre.Avices.MethodsBeforeAdvice;
import com.example.theatre.model.Dog;
import com.example.theatre.model.Pet;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.aop.framework.ProxyFactory;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {
//        Dog d = new Dog();
//        //d.setName("Samba");
//
//        System.out.println(d.getName()); // Samba
//
//
//        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//        String json = ow.writeValueAsString(d);
//        System.out.println(json);
//
////        Pet pet = d;
////        pet.setName("Samba");
////        System.out.println(pet.getName()); //Samba
////
////
////        Dog dog = (Dog) pet;
////
////        System.out.println(dog.getName());

        Dog dog = new Dog();

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setInterfaces(Pet.class);
        proxyFactory.setTarget(dog);
        proxyFactory.addAdvice(new MethodsBeforeAdvice());

        Pet proxyDog = (Pet) proxyFactory.getProxy();

        String name = proxyDog.getName();

        System.out.println(proxyDog.getClass());
        System.out.println(name);


    }
}




