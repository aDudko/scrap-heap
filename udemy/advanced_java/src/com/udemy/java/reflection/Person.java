package com.udemy.java.reflection;

@Author(name = "Tom")
public class Person {
    private long id;
    private String name;

    public Person() {
        this.id = -1;
        this.name = "Toll";
    }

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Person with id: " + this.id + " and name: " + this.name + " say \"Hello!\"");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
