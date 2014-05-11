package com.vollev.phonebook;

/**
 * Created by vollev on 11.05.2014.
 */
public class PhoneBook { //создаем класс
    private int id; // объявление целочисленной переменной id
    private String firstName, lastName, phone ; // объявление класса String и его экземпляров

    public int getId() {
        return id;          // значению переменной getId возвращаем значение id
    }
    public void setId(int num) {
        id = num;               // устанавливаем значение id
    }
    public String getFirstName() {
        return firstName;         // значению переменной getFirstName возвращаем значение firstName
    }
    public void setFirstName(String aFirstName)  {
        firstName = aFirstName;                   // устанавливаем значение aFirstName
    }
    public String getLastName() {
        return lastName;                          // значению переменной getLastName возвращаем значение lastName
    }
    public void setLastName(String aLastName)  {
        lastName = aLastName;}
    public String getPhone() {
        return phone;
    }
    public void setPhone(String aPhone)  {
        phone = aPhone; }

}
