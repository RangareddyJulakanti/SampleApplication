package com.oops.hasa.relationship.onetoone;

public class Person {
    private String name;
    private int age;
    private String gender;

    private PANCard panCard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public PANCard getPanCard() {
        return panCard;
    }

    public void setPanCard(PANCard panCard) {
        this.panCard = panCard;
    }

    @Override
    public String toString() {
      return "name = "+ getName() +" age = "+getAge()+" gender="+getGender()+panCard.toString();
    }
}
