package com.vollev.phonebook.model;

/**
 * Created by vollev on 11.05.2014.
 */
public class BookEntry { //создаем класс
    private int id; // объявление целочисленной переменной id
    private String firstName, lastName, phone, userAnswer; // объявление класса String и его экземпляров

    public int getId() {
        return id;          // значению переменной getId возвращаем значение id
    }

    public void setId(int num) {
        this.id = num;               // устанавливаем значение id
    }

    public String getFirstName() {
        return firstName;         // значению переменной getFirstName возвращаем значение firstName
    }

    public void setFirstName(String aFirstName) {
        this.firstName = aFirstName;                   // устанавливаем значение aFirstName
    }

    public String getLastName() {
        return lastName;                          // значению переменной getLastName возвращаем значение lastName
    }

    public void setLastName(String aLastName) {
        this.lastName = aLastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String aPhone) {
        this.phone = aPhone;
    }

   // public String getUserAnswer() {
     //   return userAnswer;
    }

  //  public void setUserAnswer(String aUserAnswer) {
      //  this.userAnswer = aUserAnswer;
    //}

//}
