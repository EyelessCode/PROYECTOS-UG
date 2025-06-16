package ug.exercise.infrastructure.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import ug.exercise.domain.interfaces.IRepositoryInterface;
import ug.exercise.domain.model.Person;

public class RepositoryPerson implements IRepositoryInterface{
    private  final List<Person> personList=new ArrayList<>();
    private final AtomicInteger idCount=new AtomicInteger(1);

    @Override
    public void save(Person person) {
        person.setId(idCount.getAndIncrement());
        personList.add(person);
    }

    @Override
    public Person searchId(int id) {
        return personList.stream()
            .filter(p ->p.getId()==id)
            .findFirst()
            .orElse(null);
    }

    @Override
    public List<Person> getAll() {
        return new ArrayList<>(personList);
    }

    @Override
    public boolean delete(int id) {
        return personList.removeIf(p ->p.getId()==id);
    }

    @Override
    public int sizeList() {
        return personList.size();
    }
}
