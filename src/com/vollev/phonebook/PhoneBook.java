package com.vollev.phonebook;


import java.util.Scanner; // импортируем класс
/**
 * Created by vollev on 11.05.2014.
 */
public class PhoneBook {
    Boolean uA;
    do {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
            System.out.println("Введите имя");
            String firstName = in.nextLine();
            System.out.println("Введите фамилию");
            String lastName = in.nextLine();
            System.out.println("Введите номер телефона");
            String phone = in.nextLine();
            System.out.print(String.format("First name: '%s'\nLast name: '%s'\nPhone: '%s'\n", firstName, lastName, phone)); }
            System.out.println("Ещё раз ? Y/N");
            String userAnswer = in.nextLine();}

        while (uA)

    }


}