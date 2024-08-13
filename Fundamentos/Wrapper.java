package Fundamentos;


import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        //Wrapper são a versão objeto dos tipos primitivos
        Byte b = 100;

        Short s = 1000;

        Integer i = 10000;

        Long l = 100000L;

        Float f = 123.0F;
        System.out.println(f);

        Double d = 123.05D;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("false");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println(Character.toString(c));

    }
}
