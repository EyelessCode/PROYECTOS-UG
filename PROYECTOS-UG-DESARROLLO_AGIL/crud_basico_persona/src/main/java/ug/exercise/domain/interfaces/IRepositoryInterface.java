package ug.exercise.domain.interfaces;

import java.util.List;

import ug.exercise.domain.model.Person;

public interface IRepositoryInterface {
    void save(Person person);
    Person searchId(int id);
    List<Person> getAll();
    boolean delete(int id);
    int sizeList();
}
