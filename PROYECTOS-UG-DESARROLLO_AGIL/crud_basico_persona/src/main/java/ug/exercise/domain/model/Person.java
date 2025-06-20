package ug.exercise.domain.model;


public class Person {
    int id;
    String name;
    int age;
    char sex;

    public Person(int age, int id, String name, char sex) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format( "Person [id= %d | name= %s | age= %d | sex= %s]",
        id,name,age,sex);
    }
}
