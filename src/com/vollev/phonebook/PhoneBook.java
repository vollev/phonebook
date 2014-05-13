package com.vollev.phonebook;

import java.util.Scanner; // импортируем класс
/**
 * Created by vollev on 11.05.2014.
 */
public class PhoneBook {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println ("Введите имя");
        String firstName = in.nextLine();
        System.out.println ("Введите фамилию");
        String lastName = in.nextLine();
        System.out.println ("Введите номер телефона");
        String phone = in.nextLine();
        System.out.print (String.format("First name: '%s'\n",firstName));
        System.out.print (String.format("Last name: '%s'\n", lastName));
        System.out.print (String.format("Phone: '%s'\n",phone));
    }
}