package org.javaPractice;

public class Person {
    private String name;
    private int age;
    private String gender;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean setAge(int age) {
        if (age >=0 && age <=100){
            this.age = age;
            return true;
        }
        return false;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


}
