package com.vollev.phonebook;


import java.util.Scanner;

/**
 * Created by vollev on 11.05.2014.
 */
public class PhoneBook {


    public static void main(String[] args) {
        String s1 = "Y";

        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Введите имя");
            String firstName = in.nextLine();
            System.out.println("Введите фамилию");
            String lastName = in.nextLine();
            System.out.println("Введите номер телефона");
            String phone = in.nextLine();
            System.out.println(String.format("First name: '%s'\nLast name: '%s'\nPhone: '%s'\n", firstName, lastName, phone));
            System.out.println("Ещё раз ? Y/N");
            s1 = in.nextLine();
        } while ("Y".equalsIgnoreCase(s1));
        if ("n".equalsIgnoreCase(s1));
        { break;}
        else
        {  System.out.println("Не понял");
            System.out.println("Ещё раз ? Y/N");
    }


}


