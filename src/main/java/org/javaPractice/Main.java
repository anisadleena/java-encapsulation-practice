package org.javaPractice;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName ("aniss");
        person.setAge (-10);
        person.setGender ("female");

        System.out.println (person.getName());
        System.out.println (person.getAge());
        System.out.println (person.getGender());

    }
}